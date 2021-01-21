package com.annyshik.controller;

import com.annyshik.entities.Human;
import com.annyshik.services.HumanService;


public class HumanController {

    private HumanService humanService = new HumanService();

    public Human buildHuman(String surName, String name, String patronymic){
        return new Human(surName, name, patronymic);
    }

    public void addHuman (Human h){
        humanService.addHuman(h);
    }


    public void getFirstOfLastNameList (Human h){
        humanService.getFirstOfLastNameList(h);
    }

    public void delHuman (Human h){
        humanService.delHuman(h);
    }


    public void showList (Human h){
        humanService.showList(h);
    }
    // это всё от артема пропустила что значит. в конце лекции пересмотреть
//    private HumanService service;
//    private EmploerService emploerService;
//
//    public HumanService (HumanService, EmploerService) {
//        this.service = service;
//        this.emploerService = service;
//    }
//
//    public void saveHumanInSystem (Human human) {
//       service.addHuman(human);
////    }
//    HumanUI humanUI;
//
//    HumanList humanList;
//
//    public HumanController(HumanUI humanUI, HumanService humanService) {
//        this.humanUI = humanUI;
//        this.humanService = humanService;
//    }
//
//    public HumanService getHumanService() {
//        return humanService;
//    }

}
