//package org.pms.sammail;
//
//public class Test {
//
//    package com.my.project;
//import com.mailjet.client.errors.MailjetException;
//import com.mailjet.client.errors.MailjetSocketTimeoutException;
//import com.mailjet.client.MailjetClient;
//import com.mailjet.client.MailjetRequest;
//import com.mailjet.client.MailjetResponse;
//import com.mailjet.client.ClientOptions;
//import com.mailjet.client.resource.Emailv31;
//import org.json.JSONArray;
//import org.json.JSONObject;
//    public class MyClass {
//        public static void main(String[] args) throws MailjetException, MailjetSocketTimeoutException {
//            MailjetClient client;
//            MailjetRequest request;
//            MailjetResponse response;
//            client = new MailjetClient(System.getenv("4bb46c13821a2486898d4f46ca2a8913"), System.getenv("6eab610abb8109fab91f741f73364289"), new ClientOptions("v3.1"));
//            request = new MailjetRequest(Emailv31.resource)
//                    .property(Emailv31.MESSAGES, new JSONArray()
//                            .put(new JSONObject()
//                                    .put(Emailv31.Message.FROM, new JSONObject()
//                                            .put("Email", "george.liolios@gmail.com")
//                                            .put("Name", "GEORGIOS"))
//                                    .put(Emailv31.Message.TO, new JSONArray()
//                                            .put(new JSONObject()
//                                                    .put("Email", "george.liolios@gmail.com")
//                                                    .put("Name", "GEORGIOS")))
//                                    .put(Emailv31.Message.SUBJECT, "Greetings from Mailjet.")
//                                    .put(Emailv31.Message.TEXTPART, "My first Mailjet email")
//                                    .put(Emailv31.Message.HTMLPART, "<h3>Dear passenger 1, welcome to <a href='https://www.mailjet.com/'>Mailjet</a>!</h3><br />May the delivery force be with you!")
//                                    .put(Emailv31.Message.CUSTOMID, "AppGettingStartedTest")));
//            response = client.post(request);
//            System.out.println(response.getStatus());
//            System.out.println(response.getData());
//        }
//    }
//}
