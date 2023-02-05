import java.util.Scanner;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Budget {
    
    static void createFile() {
        Scanner createInput = new Scanner(System.in);
        
        System.out.println("\nEnter your budget file name: ");
        String fileName = createInput.nextLine();
        try {
            File myFile = new File(fileName + ".txt");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName() + "\n");
            } else {
                System.out.println("File already exists.\n");
            }
            } catch (IOException e) {
            System.out.println("An error occurred.\n");
            e.printStackTrace();
            }
    }

    static void fileWriter() {
        Scanner writerInput = new Scanner(System.in);
        
        System.out.println("\nEnter your budget file name: ");
        String fileName = writerInput.nextLine();
        try {
            FileWriter myWriter = new FileWriter(fileName + ".txt");
            while (true) {
                System.out.println("\nWhat catagory would you like to add to: ");
                System.out.println("0: Done");
                System.out.println("1: Car");
                System.out.println("2: House/Rent");
                System.out.println("3: Phone");
                System.out.println("4: Streaming Services ie: Neflix/Spotify");
                System.out.println("5: Food");
                System.out.println("6: Savings");
                System.out.println("7: Donations");
                System.out.println("8: Other");
                int budgetAdding = writerInput.nextInt();
                
                if (budgetAdding == 1) {
                    Boolean adding = true;
                    myWriter.write("CAR:");
                    while (adding) {
                        System.out.println("\nWhat would you like to add to car? [item: price]");
                        System.out.println("When you are finished input 'done'");
                        String newAdd = writerInput.nextLine();
                        if (newAdd.equalsIgnoreCase("done")){
                            adding = false;
                        }
                        else {
                            myWriter.write(newAdd + "\n");
                        }
                    }}
                
                else if (budgetAdding == 2) {
                    Boolean adding = true;
                    myWriter.write("\nHouse/Rent:");
                    while (adding) {
                        System.out.println("\nWhat would you like to add to House/Rent? [item: price]");
                        System.out.println("When you are finished input 'done'");
                        String newAdd = writerInput.nextLine();
                        if (newAdd.equalsIgnoreCase("done")){
                            adding = false;
                        }
                        else {
                            myWriter.write(newAdd + "\n");
                        }
                    }}
                    
                else if (budgetAdding == 3) {
                    Boolean adding = true;
                    myWriter.write("\nPhone:");
                    while (adding) {
                        System.out.println("\nWhat would you like to add to Phone? [item: price]");
                        System.out.println("When you are finished input 'done'");
                        String newAdd = writerInput.nextLine();
                        if (newAdd.equalsIgnoreCase("done")){
                            adding = false;
                        }
                        else {
                            myWriter.write(newAdd + "\n");
                        }
                    }}

                else if (budgetAdding == 4) {
                    Boolean adding = true;
                    myWriter.write("\nStreaming Services:");
                    while (adding) {
                        System.out.println("\nWhat would you like to add to Streaming Services? [item: price]");
                        System.out.println("When you are finished input 'done'");
                        String newAdd = writerInput.nextLine();
                        if (newAdd.equalsIgnoreCase("done")){
                            adding = false;
                        }
                        else {
                            myWriter.write(newAdd + "\n");
                        }
                    }}
                    
                else if (budgetAdding == 5) {
                    Boolean adding = true;
                    myWriter.write("\nFood:");
                    while (adding) {
                        System.out.println("\nWhat would you like to add to Food? [item: price]");
                        System.out.println("When you are finished input 'done'");
                        String newAdd = writerInput.nextLine();
                        if (newAdd.equalsIgnoreCase("done")){
                            adding = false;
                        }
                        else {
                            myWriter.write(newAdd + "\n");
                        }
                    }}

                else if (budgetAdding == 6) {
                    Boolean adding = true;
                    myWriter.write("\nSavings:");
                    while (adding) {
                        System.out.println("\nWhat would you like to add to Savings? [item: price]");
                        System.out.println("When you are finished input 'done'");
                        String newAdd = writerInput.nextLine();
                        if (newAdd.equalsIgnoreCase("done")){
                            adding = false;
                        }
                        else {
                            myWriter.write(newAdd + "\n");
                        }
                    }}

                else if (budgetAdding == 7) {
                    Boolean adding = true;
                    myWriter.write("\nDonations:");
                    while (adding) {
                        System.out.println("\nWhat would you like to add to Donations? [item: price]");
                        System.out.println("Wen you are finished input 'done'");
                        String newAdd = writerInput.next();
                        if (newAdd.equalsIgnoreCase("done")){
                            adding = false;
                        }
                        else {
                            myWriter.write(newAdd + "\n");
                        }
                    }}
                    
                    else if (budgetAdding == 8) {
                        Boolean adding = true;
                        myWriter.write("\nOther:");
                        while (adding) {
                            System.out.println("\nWhat would you like to add to Other? [item: price]");
                            System.out.println("Wen you are finished input 'done'");
                            String newAdd = writerInput.next();
                            if (newAdd.equalsIgnoreCase("done")){
                                adding = false;
                            }
                            else {
                                myWriter.write(newAdd + "\n");
                            }
                        }}
                    
                    else if (budgetAdding == 0) {
                        myWriter.close();
                        break;
                    }

                    else {
                        System.out.println("\nInvalid input try again. ");
                    }
            }
            System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            
    }

    static void fileReader() {
        Scanner readerInput = new Scanner(System.in);
        
        System.out.println("\nWhich budget file would you like to view: ");
        String fileName = readerInput.nextLine();
        System.out.println("");
        try {
            File myObj = new File(fileName + ".txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
    }

    static void budgetTotal() {
        Scanner budgetInput = new Scanner(System.in);
        Float howMuch = 1.00f;
        float sum = 0.00f;

        Vector<Float> costList=new Vector<>();
        while (howMuch != 0.00) {
            System.out.println("\nHow much does your item cost?");
            System.out.println("When you are finished input 0");
            howMuch = budgetInput.nextFloat();
            costList.add(howMuch);
        }
        for (Float i : costList) {
            sum += i;
        }
        System.out.println("\nYour total is: " + sum);
    }


    public static void main(String[] args) {
        Scanner mainInput = new Scanner(System.in);
        int userInput = 0;
        String whileUsing;
        System.out.println("\nWould you like to create, edit, or view a budget? (yes/no)");
        whileUsing = mainInput.nextLine();
        while (whileUsing.equalsIgnoreCase("yes")) {
            userInput = 0;
            System.out.println("\nEnter which number you would like to do: ");
            System.out.println("1: Create a Budget file");
            System.out.println("2: Add to a Budget");
            System.out.println("3: View a Budget");
            System.out.println("4: Get budget total");
            System.out.println("5: Exit Program");
            userInput = mainInput.nextInt();
            
            if(userInput == 1) {
                createFile();
            }

            if (userInput == 2) {
                fileWriter();
            }

            else if (userInput == 3){
                fileReader();
            }

            else if (userInput == 4) {
                budgetTotal();
            }

            else if (userInput == 5) {
                whileUsing = "no";
            }
            
            else {
                System.out.println("Invalid input try again.");
            }
            
        }
        mainInput.close();
    }
    
}
