
public class Main {

	static CatInfo alice = new CatInfo("Alice", 87, 50, 88, 10);
	static CatInfo felix = new CatInfo("Felix", 85, 60, 87, 10);
	static CatInfo bob = new CatInfo("Bob", 88, 60, 89, 10);
	static CatInfo doughnut = new CatInfo("Doughnut", 85, 50, 86, 10);
	static CatInfo eleanor = new CatInfo("Eleanor", 85, 45, 86, 10);
	static CatInfo hilda = new CatInfo("Hilda", 95, 55, 96, 10);
	static CatInfo gaia = new CatInfo("Gaia", 86, 55, 87, 10);
	static CatInfo coco = new CatInfo("Coco", 87, 55, 88, 10);
	static CatTree myTree;

	public static void main(String[] args) {
		System.out.println("========================\n" + "| Welcome to Cat Cafe! |\n" + "========================");

		// System.out.println("========================\n" + "| Testing Adding |\n" +
		// "========================");
		// test_1();
		// test_2();
		// test_3();
		// test_4();
		// test_5();
		// test_full();

		System.out.println("========================\n" + "| Testing Remove |\n" + "========================");
		// test_6();
		//test_7();
		// test_8();
		//test_9();
		//test_10();

	}

	// Test: same monthsHired; bigger fur added first
	private static void test_1() {
		System.out.println(
				"========================\n" + "| Adding Felix then Doughnut |\n" + "========================");

		myTree = new CatTree(alice);
		myTree.addCat(felix);
		myTree.addCat(doughnut);
		printTree();
	};

	// Test: same monthsHired; smaller fur added first
	private static void test_2() {
		System.out.println(
				"========================\n" + "| Adding Doughnut then Felix |\n" + "========================");

		myTree = new CatTree(alice);
		myTree.addCat(doughnut);
		myTree.addCat(felix);

		printTree();

	};

	// Test: same monthsHired; added same monthsHired; smallest:medium:big fur
	private static void test_3() {
		System.out.println("========================\n" + "| Adding Eleanor then Felix then Doughnut |\n"
				+ "========================");

		myTree = new CatTree(alice);
		myTree.addCat(eleanor);
		myTree.addCat(felix);
		myTree.addCat(doughnut);
		printTree();

	};

	// Test: same monthsHired; added same monthsHired; same fur
	private static void test_4() {
		System.out.println("========================\n" + "| Adding Eleanor then testCat then Felix then Doughnut |\n"
				+ "========================");

		CatInfo testCat = new CatInfo("TestCat", eleanor.monthHired, eleanor.furThickness,
				eleanor.nextGroomingAppointment, eleanor.expectedGroomingCost);
		myTree = new CatTree(alice);
		myTree.addCat(eleanor);
		myTree.addCat(testCat);
		myTree.addCat(felix);
		myTree.addCat(doughnut);
		printTree();

	};

	// Test: all cats + a cat that has equal fur to another and a link
	private static void test_5() {
		System.out.println("========================\n"
				+ "| Running the full test in order and adding a cat of equal fur |\n" + "========================");

		CatInfo testCat = new CatInfo("TestCat", felix.monthHired, felix.furThickness, felix.nextGroomingAppointment,
				felix.expectedGroomingCost);

		myTree = new CatTree(alice);
		myTree.addCat(bob);
		myTree.addCat(felix);
		myTree.addCat(doughnut);
		myTree.addCat(eleanor);
		myTree.addCat(hilda);
		myTree.addCat(gaia);
		myTree.addCat(coco);
		myTree.addCat(testCat);

		printTree();
	};

	// Test: delete Coco from tree
	private static void test_6() {
		System.out.println("========================\n" + "| Running the full test and removing Coco |\n"
				+ "========================");

		myTree = new CatTree(alice);
		myTree.addCat(bob);
		myTree.addCat(felix);
		myTree.addCat(doughnut);
		myTree.addCat(eleanor);
		myTree.addCat(hilda);
		myTree.addCat(gaia);
		myTree.addCat(coco);

		myTree.removeCat(coco);
		printTree();
	};

	// Test: delete Coco and Alice from tree
	private static void test_7() {
		System.out.println("========================\n" + "| Running the full test and removing Coco and Alice |\n"
				+ "========================");

		myTree = new CatTree(alice);
		myTree.addCat(bob);
		myTree.addCat(felix);
		myTree.addCat(doughnut);
		myTree.addCat(eleanor);
		myTree.addCat(hilda);
		myTree.addCat(gaia);
		myTree.addCat(coco);

		myTree.removeCat(coco);
		myTree.removeCat(alice);
		printTree();
	};

	// Test: delete Coco and Alice from tree
	private static void test_8() {
		System.out.println("========================\n"
				+ "| Running the full test and removing Coco and Alice and Bob |\n" + "========================");

		myTree = new CatTree(alice);
		myTree.addCat(bob);
		myTree.addCat(felix);
		myTree.addCat(doughnut);
		myTree.addCat(eleanor);
		myTree.addCat(hilda);
		myTree.addCat(gaia);
		myTree.addCat(coco);

		myTree.removeCat(coco);
		myTree.removeCat(alice);
		myTree.removeCat(bob);
		printTree();
	};

	// Test: delete root
	private static void test_9() {
		System.out.println(
				"========================\n" + "| Adding Alice then removing Alice |\n" + "========================");

		myTree = new CatTree(alice);
		myTree.addCat(felix);
		myTree.removeCat(alice);
		printTree();
	};
	
	//Test: Test removeCat when Node to remove is at root
	private static void test_10() {
		System.out.println(
				"========================\n" + "| Test 6 from MiniTester |\n" + "========================");
		CatInfo a = new CatInfo("A", 87, 50, 243, 40);
		CatInfo b = new CatInfo("B", 85, 60, 240, 30);
		CatInfo c = new CatInfo("C", 88, 70, 248, 10);
		
		CatTree t = new CatTree(a);
		t.addCat(b);
		
		t.removeCat(c);	//nothing should change since c not in tree
		t.removeCat(a);
		printTree();
	}

	// Creates all the cats from the initial example of addcats
	private static void test_full() {
		System.out.println("\n========================\n" + "| Running the full test in order! |\n"
				+ "========================\n");

		myTree = new CatTree(alice);
		myTree.addCat(bob);
		myTree.addCat(felix);
		myTree.addCat(doughnut);
		myTree.addCat(eleanor);
		myTree.addCat(hilda);
		myTree.addCat(gaia);
		myTree.addCat(coco);

		printTree();
	};

	public static void printTree() {
		System.out.println(myTree.root);
	}
}
