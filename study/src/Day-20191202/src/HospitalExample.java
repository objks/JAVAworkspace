
public class HospitalExample {
	public static void main(String[] args) {
		PersonValue pv = new PersonValue();
		DoctorValue dv = new DoctorValue();
		NurseValue nv = new NurseValue();
		PatientValue pav = new PatientValue();
		
		// �Ϲ�ȭ ��Ÿ��
		System.out.println("Person Info : " + pv.getInfo());
		System.out.println("Person Info : " + dv.getInfo());
		System.out.println("Person Info : " + nv.getInfo());
		System.out.println("Person Info : " + pav.getInfo());
		
	}
}
