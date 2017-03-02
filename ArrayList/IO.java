public class ReadText {

  public static String countFileSize(String file){

    int charCounter = 0;
    int wordCounter = 0;
    int lineCounter = 0;
    int readChar;

    try{
    BufferedReaderint = new BufferedReader(new FileReader(file));
//loops through file to see if its exual to -1
    while ((readChar = in.read()) != -1){
//type casting to char type
      if ((char) readChar == '\n'){
        lineCounter ++;
      }
      if ((char) readChar == '' || (char) readChar == '/n'){
        wordCounter++;
      }
      charCounter ++;
    }
    in.close();
    return "Number of files" + lineCounter;
    readChar = in.read()
  } catch (FileNotFoundException e){

  } catch (IOException e){

  }



    BufferedReader in = new BufferedReader(new FileReader(file.txt));


  }

public static void main(String[] args){
  System.out.println(countFileSize('nameOftext.txt'));
}

}
