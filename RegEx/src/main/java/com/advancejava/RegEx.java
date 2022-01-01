package com.advancejava;

import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegEx
{

    public String findCardTypeNumbers(String conversation, String cardType)
    {
      ArrayList<String> extract =new ArrayList<String>();
      String result="";
      Pattern p = Pattern.compile("-?\\d+");
      Matcher m = p.matcher(conversation);
      while (m.find()) {
        extract.add(m.group());
        //System.out.println(m.group());
      }
      if(cardType.equalsIgnoreCase("JCB")){
          for(int i=0; i<extract.size() ; i++){
             String card = extract.get(i);
             if(((card.length() == 15) && (card.substring(0,4).equals("2131") || card.substring(0,4).equals("1800"))) || ((card.length() == 16) && (card.substring(0,2).equals("35")))){
                 result +=card+" ";
             }
          }
          if(result.length()==0){
              result = "Not a valid card type";
          }
          result= result.substring(0,result.length()-1);
      }
      else if(cardType.equalsIgnoreCase("Visa")){
          for(int i=0; i<extract.size() ; i++){
             String card = extract.get(i);
             if((card.length() == 13 || card.length() == 16) && card.substring(0,1).equals("4")){
                 result +=card+" ";
             }
          }
          if(result.length()==0){
              result = "Not a valid card type";
          }
          result= result.substring(0,result.length()-1);
      }
      else if(cardType.equalsIgnoreCase("American Express")){
          for(int i=0; i<extract.size() ; i++){
          String card = extract.get(i);
             if((card.length() == 15) && (card.substring(0,2).equals("34") || card.substring(0,2).equals("37"))){
                 result +=card+" ";
             }
          }
          if(result.length()>0){
              result= result.substring(0,result.length()-1);
          }

      }
      else if(cardType.equalsIgnoreCase("Discover")){
          for(int i=0; i<extract.size() ; i++){
          String card = extract.get(i);
             if((card.length() == 16) && (card.substring(0,4).equals("6011") || card.substring(0,2).equals("65"))){
                 result +=card+" ";
             }
          }
          if(result.length()==0){
              result = "Not a valid card type";
          }
          result= result.substring(0,result.length()-1);
      }
      else{
          result = "Not a valid card type";
      }
      //Credict
      //Not a valid card type
      return result;
    }
}