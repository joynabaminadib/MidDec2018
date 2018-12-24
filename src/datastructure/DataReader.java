package datastructure;

import java.io.BufferedReader;
import java.io.FileReader;

    public class DataReader {

        public static void main(String[] args) {
            FileReader fr=null;
            BufferedReader br=null;
            String textFile = "C:\\Users\\adibi\\Desktop\\nayna\\MidtermNovember2018\\src\\data\\self-driving-car";
            try{
                fr=new FileReader(textFile);
                System.out.println("your File has been found.");
            }catch(Exception e){
                System.out.println("File b did not found");
            }

            try{ br=new BufferedReader(fr);
                String data="";
                while((data=br.readLine())!=null){
                    System.out.println(data);
                }

            }catch (Exception ex){
                System.out.println("Your data is not there .");
            }





        }

    }

