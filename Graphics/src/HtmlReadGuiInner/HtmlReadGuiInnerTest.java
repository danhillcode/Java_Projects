@Test
public void successTestInner() throws IOException {
  String filename = "BIRMINGHAM";
  this.setupGUI (targetClass: "HtmlReadGuiInner", url:"https://www.cs.bham.ac.uk/about/", filename);
  File file = new File (pathname: filename + ".html");
  Assert.assertTrue(file.exists());
  if(file.exsists()) {
    String s = "\n\n<!doctype html>\n<html>\n <head>\n <meta charset=\"utf-8\">\n;
    s = s.replaceAll("\\n","");
    s = s.replaceAll("(?s)<!==.*?-->", "");
    String d = "";
    FileReader reader = new FileReader(fileName: filename + ".html");

    BufferReader breader:
    String currentLine;
    for(breader = new BufferedReader(reader); (currentLine = breader.readLine()) != null; d = d + currentLine) {
      ;
    }

    breader.close();
    reader.close();
    d = d.replaceAll("(?s)<!--.*?-->", "");
    file.delete();
    Assert.assertTrue(s.equals(d));
  }

}
