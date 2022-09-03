
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        int k = 0;
        int choice = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of entries");
        int n = sc.nextInt();
        n = n + k;
        College college[] = new College[n+k];
        while(choice == 1)
        {
        for(int i=k; i<n+k; i++)
        {
            System.out.println("Enter ID");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name");
            String name = sc.nextLine();
            System.out.println("Enter contact number");
            int contactNo= sc.nextInt();
            sc.nextLine();
            System.out.println("Enter address");
            String address = sc.nextLine();
            System.out.println("Enter pin code");
            int pincode = sc.nextInt();
            college[i] = new College(id, contactNo,  pincode,  name,  address);  
        }
        k = n;
        System.out.println("Enter choice\n1. To add additional entry\n2. To Search for entry using address\n3. To exit");
        choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1)
        {
            System.out.println("Enter extra number of entries");
            k = sc.nextInt();
        }
        }
        if (choice == 1)
        {
            System.out.println("Enter extra number of entries");
            k = sc.nextInt();
        }
        if (choice == 3)
        {
            System.exit(0);
        }
        System.out.println("Enter the address you want to search");
        sc.nextLine();
        String searchaddress = sc.nextLine();
        College res1 = findCollegeWithMaximumPincode(college);
        if(res1!=null)
        {
            System.out.println("id-"+res1.getId());
            System.out.println("name-"+res1.getName());
            System.out.println("contactNo-"+res1.getContactNo());
            System.out.println("address-"+res1.getAddress());
            System.out.println("pincode-"+res1.getPincode());
        }
        else
        {
            System.out.println("No College found with mentioned attribute");
        }
        College res2 =searchCollegeByAddress(college,searchaddress);
        if(res2!=null)
        {
            System.out.println("id-"+res2.getId());
            System.out.println("name-"+res2.getName());
            System.out.println("contactNo-"+res2.getContactNo());
            System.out.println("address-"+res2.getAddress());
            System.out.println("pincode-"+res2.getPincode());
        }
        else
        {
            System.out.println("No College found with mentioned attribute.");
        }
    }
    
public static College findCollegeWithMaximumPincode(College col[])
{
    int max=0;
    College result =null;
    for(int i=0; i<col.length; i++)
    {
            if(col[i].getPincode() > max)
            {
                result = col[i];
                max= col[i].getPincode();
            }  
    }
    if(result!=null)
    {
        return result;
    }
    else
    {
        return null;
    }
}
public static College searchCollegeByAddress(College c[],String address)
{
    College ans=null;
    for(int i=0;i<c.length;i++)
    {
        if(c[i].getAddress().equalsIgnoreCase(address))
        {
            ans=c[i];
        }
    }
        if(ans!=null)
        {
            return ans;
        }
        else
        {
            return null;
        }
    }
}
