package com.Lockedme;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BusinessOperation {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="E:\\LockedMe\\";
		String filename;
		boolean res=false;
		boolean application_terminate = false;
		Scanner sc = new Scanner(System.in);
		
		while(!application_terminate) {
			int choice;
			System.out.println("******************************************************************************************");
			System.out.println("**ApplicationName:LockedMe Digital Services \t Developer Name: Srichandan Yerragudi   **");	
			System.out.println("**press 1 to display the files already present in the directory\t\t\t\t**");
			System.out.println("**press 2 to enter File operation mode\t\t\t\t\t\t\t**");
			System.out.println("**press 3 to exit the application\t\t\t\t\t\t\t**");
			System.out.println("******************************************************************************************");
			choice = sc.nextInt();
			switch(choice){
				case(1):
					File rerun = new File(path);
					File fl[] = rerun.listFiles();
					for(File r:fl) {
						String files=r+"";
						String fileslist[]=files.split("\\\\");
						System.out.println(fileslist[fileslist.length-1]);
					}
					application_terminate =true;
					break;
				
				case(2):
					System.out.println("press 1 to create the desired file ");
					System.out.println("press 2 to delete the desired file ");
					System.out.println("press 3 to search for a desired file ");
					System.out.println("press 4 to return back to main menu ");
					int selection;
					
					selection=sc.nextInt();
					
					switch(selection) {
					
					case(1):
						System.out.println("You have entered create mode");
						System.out.print("Enter the file name: ");
						filename =path+sc.next();
						File fc = new File(filename);					
						try {
							res = fc.createNewFile();
						} catch (IOException e) {
		
							//e.printStackTrace();
						}
						
						if(res) {
							System.out.println("file created");
						}
						else {
							System.out.println("file couldn't be created");
						}
						break;
					case(2):
						System.out.println("You have entered delete mode");
						System.out.print("Enter the file name: ");
						filename =path+sc.next();
						File fd = new File(filename);
						res = fd.delete();
						
						if(res) {
							System.out.println("file deleted");
						}
						else {
							System.out.println("file couldn't be deleted");
						}
							break;
					case(3):
						System.out.println("You have entered search mode");
						System.out.print("Enter the file name: ");
						filename =path+sc.next();
						File fs = new File(path); // Search Directory
						File farray[] = fs.listFiles();
						File desiredFile = new File(filename);
						
						for (File f: farray) {
							if (f.equals(desiredFile)) {
								res= true;
								break;
							}
							else {
								res= false;
							}
						}
						System.out.println(res);
						break;
					case(4):
						System.out.println("Returning back to main menu");
						break;
					
			
				}
					break;
				case(3):
					application_terminate=true;
					//System.out.println("Application terminated");
					
				sc.close();
			
		}

	}

}
}
