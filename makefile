Runner.class: Runner.java Integeral.class Derivative.class
		javac -g Runner.java

Integeral.class: Integeral.java
		javac -g Integeral.java

Derivative.class: Derivative.java
		javac -g Derivative.java

clean:
		rm *.class
		rm output.txt

run: Runner.class
		java Runner.class

runDer: Derivative.class
		java -g Derivative.class

runInter: Integeral.class
		java -g Integeral.class

debug: Runner.class
		jdb Runner.class

debugDer: Derivative.class
		jdb Derivative.class

debugInter: Integeral.class
		jdb Integeral.class
