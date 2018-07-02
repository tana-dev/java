### setting
export CLASSPATH="./:./dir1"

### compile
practice3/src/$ javac TestArray.java -d ../classes/

### create jar
practice3/$ jar cfe ./jar/TestArray.jar TestArray -C classes .

### Run
practice3/jar/$ java -jar TestApp.jar

