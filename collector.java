//This program will illustrate the concepts learned in collector

public class Collector
{

	public static void main (String [] args)
	{


		//declaration of String array
		String[] outputText = new String[10];
		outputText[0] = "I";
		outputText[1] = "love";
		outputText[2] = "my";
		outputText[3] = "dog";
		outputText[4] = "Cricket";
		outputText[5] = "and";
		outputText[6] = "Gina";
		outputText[7] = "is";
		outputText[8] = "okay";
		outputText[9] = "too";

		//for loop to iterate through the String array
		//demonstrate knowledge of collections and how to loop through arrays
		for(int i = 0; i < outputText.length; i++)
		{
			System.out.print(outputText[i] + " ");
		}
		System.out.println();

	}
}
