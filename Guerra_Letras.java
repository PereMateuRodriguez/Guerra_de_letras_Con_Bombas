public class Main {
  public static void main(String[] args) {
    String fight = "**aa**";
    
    StringBuilder str = new StringBuilder(); 
   	str.append(fight);
    
    //Recorrer el string
    //Recorrer el string
    for(int i = 0; i < str.length(); i++){
    //Identiicar las *
    	//Posicon 0
    	if(i == 0 && str.charAt(i) == '*'){
        	if(str.charAt(i+1) == '*'){
            	str = str.replace(i ,i +1,"_");
            }
            else{
            	str = str.replace(i ,i+2 ,"__");
            }
        }
        //Posicion ultima
        else if(i == str.length() -1 && str.charAt(i) == '*' ){
        	str = str.replace(i-1 ,i+1, "__");
        }
        //Resto de Posicion
        else if(str.charAt(i) == '*' ){
        	if(str.charAt(i+1) == '*'){
            	str = str.replace(i-1 , i+1 , "__");
            }
            
            else{
            	str = str.replace(i-1 , i+2 , "___");
            }
        }
    }
    
    String frase = str.toString().replaceAll("_", "");
	int left = 0;
   
    int rigth = 0;
   	System.out.println(frase);
    
	for(int i = 0; i < frase.length(); i++){
    	char letra = frase.charAt(i);
        
        switch(letra){
        	//left
        	case 'w':
            	left = left + 4;
                break;
            case 'p':
            	left = left + 3;
                break;
            case 'b':
            	left = left + 2;
                break;
            case 's':
            	left = left + 1;
                break;
           //rigth
            case 'm':
            	rigth = rigth + 4;
                break;
            case 'q':
            	rigth = rigth + 3;
                break;
            case 'd':
            	rigth = rigth + 2;
                break;
            case 'z':
            	rigth = rigth + 1;
                break;
        }
    }
    
    if(left > rigth){
    	System.out.println("Left side wins!");
    }
    else if (rigth > left){
    	System.out.println("Rigth side wins!");
    }
    else{
    	System.out.println("Let's fight again!");
    }
    
  }
}
