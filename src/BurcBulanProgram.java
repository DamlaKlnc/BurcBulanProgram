import java.util.Scanner;
public class BurcBulanProgram {
    public static void main(String[] args) {
        int month,day;
        String burc= null;
        boolean isError=false;
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen doğduğunuz ayı giriniz: ");
        month=input.nextInt();

        System.out.print("Lütfen doğdunuz günü giriniz: ");
        day=input.nextInt();
        if(month<=12 && month>=1){
            if(month==3){
                if(day>=1 && day<=31){
                    if(day>=21){
                        burc="Koç";
                    }else{
                        burc="Balık";
                    }
                }else{
                    isError=true;
                }
            }else if(month==4){
                if(day>=1 && day<=30){
                    if(day>=21){
                        burc="Boğa";
                    }else{
                        burc="Koç";
                    }
                }else{
                    isError=true;
                }
            }else if(month==5){
                if(day>=1 && day<=31){
                    if(day>=22){
                        burc="İkizler";
                    }else{
                        burc="Boğa";
                    }
                }else{
                    isError=true;
                }
            }else if(month==6){
                if(day>=1 && day<=30){
                    if(day>=23){
                        burc="Yengeç";
                    }else{
                        burc="İkizler";
                    }
                }else{
                    isError=true;
                }
            }else if(month==7){
                if(day>=1 && day<=31){
                    if(day>=23){
                        burc="Aslan";
                    }else{
                        burc="Yengeç";
                    }
                }else{
                    isError=true;
                }
            }else if(month==8){
                if(day>=1 && day<=31){
                    if(day>=23){
                        burc="Başak";
                    }else{
                        burc="Aslan";
                    }
                }else{
                    isError=true;
                }
            }else if(month==9){
                if(day>=1 && day<=30){
                    if(day>=23){
                        burc="Terazi";
                    }else{
                        burc="Başak";
                    }
                }else{
                    isError=true;
                }
            }else if(month==10){
                if(day>=1 && day<=31){
                    if(day>=23){
                        burc="Akrep";
                    }else{
                        burc="Terazi";
                    }
                }else{
                    isError=true;
                }
            }else if(month==11){
                if(day>=1 && day<=30){
                    if(day>=22){
                        burc="Yay";
                    }else{
                        burc="Akrep";
                    }
                }else{
                    isError=true;
                }
            }else if(month==12){
                if(day>=1 && day<=31){
                    if(day>=22){
                        burc="Oğlak";
                    }else{
                        burc="Yay";
                    }
                }else{
                    isError=true;
                }
            }else if(month==1){
                if(day>=1 && day<=31){
                    if(day>=22){
                        burc="Kova";
                    }else{
                        burc="Oğlak";
                    }
                }else{
                    isError=true;
                }
            }else if(month==2){
                if(day>=1 && day<=28){
                    if(day>=20){
                        burc="Balık";
                    }else{
                        burc="Kova";
                    }
                }else{
                    isError=true;
                }
            }
        }else{
            isError=true;
        }
    if (isError){
        System.out.print("Hatalı giriş yaptınız.");
    }else{
        System.out.print("Burcunuz : "+burc);
    }

    }
}
