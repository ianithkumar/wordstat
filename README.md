# Load a paragraph and calculate the word statistics
This uses __java 19__

Steps
* load a paragaph from a file
* remove the unnessary characters like .,;:-+=(){}
* tokenize the paragraph in to bag of words as List<String>
* remove frequently used words like a, an, of, the, to in on
* calculate the following statistics
    * top frequently used word
    * least used word
    * longest word
    * shortest word
    * non english word if any (bonus)

# Build and Run
``mvn clean package``

``java -jar target/wordstat-1.0-SNAPSHOT-jar-with-dependencies.jar com.anith.stat.WordStat c:/myparagraph.txt``