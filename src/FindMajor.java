import java.util.*;
/**
 *
 * @author lava_melissa_deleon
 */
public class FindMajor{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String code = input.nextLine();
        do
        {
            if(code.length()==2)// 'm' ,
            {
               char major = code.charAt(0);
               char status = code.charAt(1);
               if(findMajor(major).equals("Invalid String")||findStatus(status).equals("Invalid String"))
               {
                   System.out.println("Invalid String");
                   System.out.print("Enter two characters: ");
                   code = input.nextLine();
                   continue;
               }
               System.out.println("Major : "+findMajor(major)+  " Status :"+findStatus(status));
               break;
            }
            else
            {
                 System.out.println("Invalid String");
                 System.out.print("Enter two characters: ");
                 code = input.nextLine();
            }
        }while(true);
 

        System.exit(0);
        
    }
     public static String findStatus(char status)
     {
        switch (status)
        {
            case '1': return "Freshman";
            case '2': return "Sophomore";
            case '3': return "Junior";
            case '4': return "Senior";
                default: return "Invalid String";
        }
    }

    public static String findMajor(char major) 
    {
        major = Character.toUpperCase(major);
        switch (major) {
            case 'M':
                return "Mathematics";
            case 'C':
                return "Computer Science";
            case 'I':
                return "Information Technology";
            default:
                return "Invalid String";
        }
    }

}
