/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cleancode_08;

/**
 *
 * @author gamze
 */
public class CleanCode_08 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    	// Hata kodları yerine exception

// if (deletePage(page) == E_OK) {
//        if (registry.deleteReference(page.name) == E_OK) {
//            if (configKeys.deleteKey(page.name.makeKey()) == E_OK){
//                logger.log("page deleted");
//            } else {
//                logger.log("configKey not deleted");
//            }
//        } else {
//            logger.log("deleteReference from registry failed");
//        }
//    } else {
//        logger.log("delete failed");
//        return E_ERROR;
//    }


//    try {
//        deletePage(page);
//        registry.deleteReference(page.name);
//        configKeys.deleteKey(page.name.makeKey());
//    }
//    catch (Exception e) {
//        logger.log(e.getMessage());
//    }
    }


}
