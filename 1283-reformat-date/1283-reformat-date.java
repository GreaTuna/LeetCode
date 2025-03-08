class Solution {
    public String reformatDate(String date) {
        Map<String,String> months = new HashMap<>();

        months.put("Jan","01");
        months.put("Feb","02");
        months.put("Mar","03");
        months.put("Apr","04");
        months.put("May","05");
        months.put("Jun","06");
        months.put("Jul","07");
        months.put("Aug","08");
        months.put("Sep","09");
        months.put("Oct","10");
        months.put("Nov","11");
        months.put("Dec","12");

        StringBuilder sb = new StringBuilder();
        int firstSpace = date.indexOf(" ");
        int lastSpace = date.lastIndexOf(" ");

        String year = date.substring(date.length() - 4);
        String month = months.get(date.substring(firstSpace + 1, lastSpace));
        String day = date.substring(0, firstSpace - 2);
        
        sb.append(year + "-" + month + "-" + (day.length() == 1 ? "0" + day : day));
        return sb.toString();
    }
}