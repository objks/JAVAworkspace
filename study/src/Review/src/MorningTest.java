
public class MorningTest {

	public static void main(String[] args) {
		Morning mor = new Morning();
		System.out.println("��� �÷� : " + mor.color);
		mor.showcolor();
		mor.color = "����";
		mor.showcolor();
		
		Morning lysCar = new Morning("���κ���", 1800);	// ����� �ɼǰ��� �Է�
		lysCar.showcolor();	// ���κ���
		lysCar.run(100);
		lysCar.run(400);
		lysCar.run(350);
		System.out.println("������ : " + lysCar.showKm());	// ������� ����Ÿ� ����
												// 850
		lysCar.use(100);		// �����ﰢ���  ���簡ġ 1000�̾����� 900 
		lysCar.nowPrice();		// ���� 
		
		Morning yhiCar =new Morning("ȭ��Ʈ��");
		yhiCar.showcolor();
		yhiCar.run(1);
		System.out.println("������ : " + yhiCar.showKm());
	}

}
