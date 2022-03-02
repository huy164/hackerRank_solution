 public static String timeConversion(String s) {
        String sub = s.substring(2,8);
        String strHour=s.substring(0,2);
        int intHour=Integer.parseInt(strHour);  
    if(s.contains("PM")){
        if(intHour<12){
            intHour+=12;
        }
        String  result=Integer.toString(intHour).concat(sub);
        return result;
    }
    if(intHour==12){
         strHour="00";
        return strHour.concat(sub);
    }
    return s.substring(0,8);
    }
