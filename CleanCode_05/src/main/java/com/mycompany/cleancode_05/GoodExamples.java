/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cleancode_05;

/**
 *
 * @author gamze
 */
public class GoodExamples {
    @Autowired
    private HelperClass helperClass;

    // Soru bu fonksiyonun içinden x tane daha fonsiyon çıkar mı??
    public void getAnswerFlow(ChannelRequest channelRequest) {
        if (!checkNlpNeed(channelRequest)){
            helperClass.getButtonAnswer();
        }
        getAnswerWithNlpEngine(channelRequest);
    }

    public boolean checkNlpNeed(ChannelRequest channelRequest) {
        if (channelRequest.isEarlyControl() && channelRequest.isPostback()) {
            return false;
        }
        return true;
    }

    public void getAnswerWithoutNlpEngine(ChannelRequest channelRequest) {
        helperClass.getEarlyAnswer();
    }

    public void getAnswerWithNlpEngine(ChannelRequest channelRequest) {
        String nlpResult = helperClass.nlpEngine();
        helperClass.getAnswer(nlpResult);
    }

}

