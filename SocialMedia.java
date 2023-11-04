import java.util.*;
import java.lang.*;
class SocialMedia{
public static void main(String[] args){
		Media im=new IntImplement();
		Scanner sc=new Scanner(System.in);		
		System.out.println("SOCIAL MEDIA TRACKER....!!!!\n");
		String user="Naharaj";
		String pass="Naharaj394";
		System.out.println("Enter your username:");
		String u=sc.nextLine();
		System.out.println("Enter your Password:");
		String p=sc.nextLine();
		boolean flag=true;
		if(u.equals(user) && p.equals(pass)){
		while(flag){
		System.out.println("1.ADD POST!!\n2.VIEW PROFILE!!\n3.VIEW OTHERS POST!!\n4.EXIT");
		int cho=sc.nextInt();
		switch(cho){
			case 1:
				im.AddPost();
				break;
			case 2:
				im.ViewProfile();
				break;
			case 3:
				im.ViewOtherPost();
				break;
			case 4:
				flag=false;
				sc.close();
			}
		}
	}
	else{
		System.out.println("Invalid username or Password!!!???");
	}
}}
interface Media{
	public void AddPost();
	public void ViewProfile();
	public void ViewOtherPost();
}
class IntImplement implements Media{
	List<ImagePost> Posts = new ArrayList<>();
	List<VideoPost> post=new ArrayList<>();
	
	IntImplement(){
	}
	public void AddPost() {
    Scanner sc = new Scanner(System.in);
    System.out.println("1.Image Post \n2.Video Post");
    int ch = sc.nextInt();
    if (ch == 1) {
        System.out.println("Enter Title of Image:");
        sc.nextLine();
        String Title = sc.nextLine();
        System.out.println("Enter Description of Image:");
        String Description = sc.nextLine();
        System.out.println("Enter Caption of Image:");
        String caption = sc.nextLine();
		System.out.println();
        Posts.add(new ImagePost(Title, Description, caption, "Available"));
        System.out.println("Image Post Added Successfully...!!!\n");
    } else {
        System.out.println("Enter Title of Video:");
        sc.nextLine();
        String VTitle = sc.nextLine();
        System.out.println("Enter Description of Video:");
        String VDescription = sc.nextLine();
        System.out.println("Enter Caption of Video:");
        String Vcaption = sc.nextLine();
	System.out.println();
        post.add(new VideoPost(VTitle, VDescription, Vcaption, "Available"));
        System.out.println("Video Post Added Successfully...!!!\n");
    }
}
	public void ViewProfile(){
	System.out.println("Username:Naharaj_ram_381");
	System.out.println("Available Posts!!!...\n");
	for(ImagePost p:Posts){
	if (p.GetAvailability().equals("Available")) {
		System.out.println("Image Posts!!");
		System.out.println("Title: " + p.GetTitle());
                System.out.println("Description: " + p.GetDescription());
                System.out.println("Caption: " + p.Getcaption() + "\n");
		}
	}
	for(VideoPost pos:post){
	if(pos.GetVAvailability().equals("Available")){
		System.out.println("Video Posts!!");
		System.out.println("Title: " + pos.GetVTitle());
        System.out.println("Description: " + pos.GetVDescription());
        System.out.println("Caption: " + pos.GetVcaption() + "\n");
		}
	}
	}
	 public void ViewOtherPost(){
		System.out.println("Username:Priya_Sweetiee");
		ImagePost im=new ImagePost("Mountain View","Sun Shines","Be his Sun shine"," ");
		postbehaviour();
		ImagePost im1=new ImagePost("Snowfall picture","Snowss","Snows with Stars"," ");
		postbehaviour();
	}
	public void postbehaviour(){
		Scanner sc=new Scanner(System.in);
		int like=0,Dislike=0;
		System.out.println("1.Like \n2.Dislike");
		int c=sc.nextInt();
		sc.nextLine();
		if(c==1){
			like+=1;
			System.out.println("\nNo of Likes:"+like);
			System.out.println("No of Dislikes"+Dislike);
		}
		else{
			Dislike+=1;
			System.out.println("\nNo of Likes:"+like);
			System.out.println("No of Dislikes"+Dislike);
		}
		System.out.println("Comment? 1.yes 2.no");
		int r=sc.nextInt();
		sc.nextLine();
		if(r==1){
			System.out.println("Enter your Comment:");
			String com=sc.nextLine();
			System.out.println("\nYou have commented:"+com);
			System.out.println();
		}
		else{
			System.out.println("Thanks for Visiting my Post!!!");
		}
	}
}
class ImagePost{

private String Title;
private String Description;
private String caption;
private String Availability;

ImagePost(){
}

ImagePost(String Title,String Description,String caption,String Availability){
	this.Title=Title;
	this.Description=Description;
	this.caption=caption;
	this.Availability=Availability;
	IPDisp(Title,Description,caption);
}
public String GetTitle(){
	return Title;
}
public void SetTitle(String Title){
	this.Title=Title;
}

public String GetDescription(){
	return Description;
}
public void SetDescription(String Description){
	this.Description=Description;
}

public String Getcaption(){
	return caption;
}
public void Setcaption(String caption){
	this.caption=caption;
}
public String GetAvailability(){
	return Availability;
}
public void SetAvailability(String Availability){
	this.Availability=Availability;
}
public void IPDisp(String Title,String Description,String caption){
System.out.println("Image Title:"+Title);
System.out.println("Image Description:"+Description);
System.out.println("Image caption:"+caption);
}
}

class VideoPost{

private String VTitle;
private String VDescription;
private String Vcaption;
private String VAvailability;

VideoPost(){
}
VideoPost(String VTitle,String VDescription,String Vcaption,String VAvailability){
	this.VTitle=VTitle;
	this.VDescription=VDescription;
	this.Vcaption=Vcaption;
	this.VAvailability=VAvailability;
	VPDisp(VTitle,VDescription,Vcaption);
}
public String GetVTitle(){
	return VTitle;
}
public void SetVTitle(String VTitle){
	this.VTitle=VTitle;
}

public String GetVDescription(){
	return VDescription;
}
public void SetVDescription(String VDescription){
	this.VDescription=VDescription;
}

public String GetVcaption(){
	return Vcaption;
}
public void SetVcaption(String Vcaption){
	this.Vcaption=Vcaption;
}
public String GetVAvailability(){
	return VAvailability;
}
public void SetVAvailability(String VAvailability){
	this.VAvailability=VAvailability;
}
public void VPDisp(String VTitle,String VDescription,String Vcaption){
System.out.println("Video Title:"+VTitle);
System.out.println("Video Description:"+VDescription);
System.out.println("Video caption:"+Vcaption);
}
}

