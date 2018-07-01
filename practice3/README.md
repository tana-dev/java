### setting
export CLASSPATH="./:./dir1"

### compile
practice3/src/$ javac TestApp.java -d ../classes/

### create jar
practice3/$ jar cfe TestApp.jar TestApp -C classes .

### Run
practice3/$ java -jar TestApp.jar

