package problems.level.hard.addTwoNums;

public class AddTwoNumbers {

	public static void main(String[] args) {

		addTwoNumbers(null, null);

	}

	public static NodeList addTwoNumbers(NodeList l1, NodeList l2) {

		NodeList dummy = new NodeList(0);
		NodeList curr = dummy;
		int carry = 0;

		while (l1 != null || l2 != null || carry != 0) {
			int sum = carry;
			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}
			carry = sum / 10;
//				System.out.println(carry);
//				System.out.println(sum % 10);
			curr.next = new NodeList(sum % 10);
			curr = curr.next;
		}

		return dummy.next;
	}
}
