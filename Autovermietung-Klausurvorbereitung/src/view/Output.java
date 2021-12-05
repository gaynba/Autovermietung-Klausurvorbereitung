package view;

public class Output {
    
    // Diestleistungsmethode Datenausgabe
    public void printData(String data){
        System.out.println(data);
    }

    public static void addObject(Object ele, Object[] array){
        int i = 0;
        for(Object a : array){
            if(a == null){
                array[i] = ele;
                break;
            }
            i++;
        }

    }


    public void showSport(){
        System.out.println();
    }
}
