package com.company;

public class Main {

        public class CarOwner { //car park class
        String ownerid;
        String mobile;
        String vehiclenumber;
        String detailsid;
        String exitid;

        HashMap<String, ArrayList<String>> carowner = new HashMap<>();
        HashMap<String, String> allowners = new HashMap<>();


        public void enter(){ //enter owner id

            allowners.put(ownerid,vehiclenumber);
            carowner.put(ownerid, new ArrayList<>());
            carowner.get(ownerid).add("owner id : "+ownerid);
            carowner.get(ownerid).add("mobile number : "+mobile);
            carowner.get(ownerid).add("vehicle number : "+vehiclenumber);
        }
        public void details(){ // view all car owner details


            for (String i : carowner.keySet()) {
                System.out.println( i + " ---> " + carowner.get(i));
            }

        }

        }



    public static void main(String[] args) {

    }

}