package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Builder
@NoArgsConstructor//기본생성자
@AllArgsConstructor//전체생성자
//@Setter
//@Getter
//@EqualsAndHashCode
//@ToString
@Data
public class Student {
	private int studentCode;
	private String name;
	private int studentYear;
	private int age;
	
}
