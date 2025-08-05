
SOURCES := $(shell find * -name "*.java")
CLASSES := $(SOURCES:.java=.class)

all: $(CLASSES)
	java es.fortytwo.avaj.simulator.Simulator scenario.txt

%.class: %.java
	@echo Compiling $<
	javac $<

clean:
	find * -name "*.class" -delete
	rm -rf sources.txt

subject:
	find * -name "*.java" > sources.txt
	javac @sources.txt
	java es.fortytwo.avaj.simulator.Simulator scenario.txt

.PHONY: all clean subject
