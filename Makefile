
SOURCES := $(shell find * -name "*.java")
CLASSPATH := src
MAIN_CLASS := es.fortytwo.avaj.simulator.Simulator

all:
	java -cp $(CLASSPATH) $(SOURCES) scenario.txt

clean:
	find * -name "*.class" -delete
	rm -rf sources.txt

subject:
	find * -name "*.java" > sources.txt
	javac @sources.txt
	java es.fortytwo.avaj.simulator.Simulator scenario.txt

.PHONY: all clean subject
