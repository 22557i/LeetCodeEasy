package final6200materials;
import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateDemo {
	public static void main(String[] args) {
		List<String> states = Arrays.asList("ma","ny","ct","vt","ri","nh","nv","nc","nd","wa","wv","ut","ca","az","al","ak","ok","pa","me","ms","il","id","mn","wy","mt","wi","ia","ar","hi","sd","sc","md","nj","de","ga","fl","mi","oh","in","or","ky","tn","va","mo","ks","co","la","tx","nm","ne");
		Predicate<String> upre = s -> {return s.startsWith("m");};
		states.stream().filter(upre).map(String::toUpperCase).sorted().forEach(s -> System.out.print(s+','));
		System.out.println("");
		Consumer<String> ucon = s -> System.out.print(s+",");
		Function<String,String> ufun = s -> s.toUpperCase();
		Supplier<String> usup = ()->" Process has finished!";
		for(String s : states){
			ucon.accept(s);
		}
		System.out.println("---------------------");
		states.stream().filter(upre).map(ufun::apply).sorted().forEach(System.out::print);
		System.out.println("");
		System.out.println(usup.get());
		System.out.println("---------------------");
	}
}
