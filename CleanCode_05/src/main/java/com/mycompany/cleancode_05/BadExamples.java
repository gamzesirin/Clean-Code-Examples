/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cleancode_05;

/**
 *
 * @author gamze
 */
public class BadExamples {

    @Autowired
    private HelperClass helperClass;

    // Soru bu fonksiyonun içinden x tane daha fonsiyon çıkar mı??
    public void getAnswerFlow(ChannelRequest channelRequest) {
        if (channelRequest.isPostback() && channelRequest.isEarlyControl()){ // Ne anlatıyor?
            /*

             */
            helperClass.getButtonAnswer();
        }
        String nlpResult = helperClass.nlpEngine();
        /*
            Uzayabilir...
         */
        helperClass.getAnswer(nlpResult);
    }

}