package org.example.healthcare;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HealthcareParser {
    public static void parseAndPrint(String filePath) {
        try {
            List<HealthcareEntry> healthcareEntries = parseTextFile(filePath);

            // Convert the list to JSON
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonString = objectMapper.writeValueAsString(healthcareEntries);

            System.out.println(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static List<HealthcareEntry> parseTextFile(String filePath) throws IOException {
        List<HealthcareEntry> healthcareEntries = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            HealthcareEntry currentEntry = null;
            boolean parsingStarted = false;

            while ((line = reader.readLine()) != null) {
                line = line.trim();

                if (line.isEmpty()) {
                    continue;
                }

                if (!parsingStarted && line.startsWith("HDR")) {
                    parsingStarted = true;
                    continue;
                }

                if (parsingStarted && line.startsWith("TRL")) {
                    break;
                }

                if (parsingStarted) {
                    String entryType = line.substring(0, 3);

                    switch (entryType) {
                        case "SUB":
                            currentEntry = new HealthcareEntry();
                            currentEntry.setSubscriber(parseSubscriber(line));
                            break;
                        case "PAT":
                            currentEntry.setPatient(parsePatient(line));
                            break;
                        case "CAS":
                            currentEntry.setCaseInfo(parseCase(line));
                            break;
                        case "SVC":
                            currentEntry.setService(parseService(line));
                            healthcareEntries.add(currentEntry);
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        return healthcareEntries;
    }

    private static Subscriber parseSubscriber(String line) {
        Subscriber subscriber = new Subscriber();
        //System.out.println("Line: " + line);

        subscriber.setCASE_NUMBER(substringSafely(line, 3, 19));
        subscriber.setMEM_ID(substringSafely(line, 19, 35));
        subscriber.setMEM_FIRST_NAME(substringSafely(line, 35, 51));
        subscriber.setMEM_MIDDLE_NAME(substringSafely(line, 51, 67));
        subscriber.setMEM_LAST_NAME(substringSafely(line, 67, 83));
        subscriber.setMEM_ADD_1(substringSafely(line, 83, 99));
        subscriber.setMEM_ADD_2(substringSafely(line, 99, 115));
        subscriber.setMEM_CITY(substringSafely(line, 115, 131));


        //System.out.println("Length of line: " + line.length());
        //System.out.println("Length of MEM_PIN substring: " + substringSafely(line, 131, 147).length());

        subscriber.setMEM_PIN(substringSafely(line, 131, 147));

        return subscriber;
    }

    private static String substringSafely(String line, int beginIndex, int endIndex) {
        if (beginIndex < 0) {
            beginIndex = 0;
        }
        if (endIndex > line.length()) {
            endIndex = line.length();
        }
        return line.substring(beginIndex, endIndex).trim();
    }

    private static Patient parsePatient(String line) {
        Patient patient = new Patient();

        patient.setCASE_NUMBER(substringSafely(line, 3, 19));
        patient.setPAT_ID(substringSafely(line, 19, 35));
        patient.setPAT_FIRST_NAME(substringSafely(line, 35, 51));
        patient.setPAT_MIDDLE_NAME(substringSafely(line, 51, 67));
        patient.setPAT_LAST_NAME(substringSafely(line, 67, 83));
        patient.setPAT_SEX(substringSafely(line, 83, 99));
        patient.setPAT_DOB(substringSafely(line, 99, 115));
        patient.setPAT_PLANE_TYPE(substringSafely(line, 115, 131));
        patient.setPAT_PLAN_NAME(substringSafely(line, 131, 147));

        return patient;
    }

    private static Case parseCase(String line) {
        Case caseInfo = new Case();
        //System.out.println("Line (CaseInfo): " + line);

        caseInfo.setCASE_NUMBER(substringSafely(line, 3, 19));
        caseInfo.setCASE_TYPE(substringSafely(line, 19, 35));
        caseInfo.setCASE_CODE(substringSafely(line, 35, 51));
        caseInfo.setCASE_START_DATE(substringSafely(line, 51, 67));
        caseInfo.setCASE_END_DATE(substringSafely(line, 67, 83));
        caseInfo.setCASE_AUTH_TYPE(substringSafely(line, 83, 99));

        return caseInfo;
    }

    private static Service parseService(String line) {
        Service service = new Service();
        //System.out.println("Line (Service): " + line);

        service.setCASE_NUMBER(substringSafely(line, 3, 19));
        service.setSVC_ID(substringSafely(line, 19, 35));
        service.setSVC_TYPE(substringSafely(line, 35, 51));
        service.setSVC_CODE(substringSafely(line, 51, 67));
        service.setSVC_FAC_ID(substringSafely(line, 67, 83));
        service.setSVC_FAC_NAME(substringSafely(line, 83, 99));
        service.setSVC_PHY_ID(substringSafely(line, 99, 115));
        service.setSVC_PHY_NAME(substringSafely(line, 115, 131));

        return service;
    }
}
