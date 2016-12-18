import java.io.File;
import java.util.ArrayList;

public class FileList {

	public static void main(String args[]){
		
		//	Create a FileList object
		FileList flObject = new FileList();
		
		//	Get list of files in the input folder
		String inputFolder = "D:\\rootFolder\\" ; 
		String[] fileList = flObject.listFilesIn(new File(inputFolder));
		
		// Print the list of files in the input folder.
		for(String fileName : fileList){
			System.out.println("File :: "+fileName.replace(inputFolder, ""));
		}
	}
	
	public String[] listFilesIn(File inputPath){
		ArrayList<String> fileArrayList = new ArrayList<String>();
		
		File[] fileList = inputPath.listFiles();
		
		for(File file : fileList){
			if(file.isDirectory()){
				System.out.println("Input Directory :: " + file.getName());
				String getRecursiveFiles[] = listFilesIn(file);
				
				for(String fileName : getRecursiveFiles){
					fileArrayList.add(fileName);
				}
				
			}
			else{
				System.out.println("Input File :: " + file.getName());
				fileArrayList.add(file.getPath());
			}
		}
		
		return fileArrayList.toArray(new String[0]);
		
	}
	
}
