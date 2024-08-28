package nationals.problems;

public class Username {
    public static void main(String[] args) {
        String name = "Mark Andrey Acebu";
        String[] nameArray = name.split(" ");
        StringBuilder builder = new StringBuilder("");
        for(int i = 0; i < nameArray.length; i++){
            char[] charArray = nameArray[i].toCharArray();
          if(i == nameArray.length - 1){
              builder.append(nameArray[i]);
          } else{
              builder.append(charArray[0]);

          }
        }
        System.out.println(builder.toString());
    }
}
