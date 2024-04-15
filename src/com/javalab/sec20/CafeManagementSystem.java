package chap06_domain_class.src.com.javalab.sec20;

import chap06_domain_class.src.com.javalab.sec19.Category;
import chap06_domain_class.src.com.javalab.sec19.Product;
import chap06_domain_class.src.com.javalab.sec19.Order;
import chap06_domain_class.src.com.javalab.sec19.Employee;

/**
 * 카페 관리 시스템[실행클래스]
 * 주문, 사원, 상품, 카테고리 도메인 클래스를 이용한 카페관리 시스템
 * 주문, 사원, 상품, 카테고리 정보를 저장하고 관리하는 역할
 */
public class CafeManagementSystem {
    public static void main(String[] args) {

        // 기초 데이터 생성 작업
// 1. 카테고리 객체를 저장할 배열 생성 및 초기화
        Category[] categoryArray = new Category[6];
        categoryArray[0] = new Category(1, "Coffee", "All types of coffee drinks");
        categoryArray[1] = new Category(2, "Latte", "Various kinds of lattes");
        categoryArray[2] = new Category(3, "Ade/Shake", "Fresh ades and shakes");
        categoryArray[3] = new Category(4, "Smoothie/Juice", "Healthy smoothies and juices")
        categoryArray[4] = new Category(5, "Bakery", "Fresh baked goods");
        categoryArray[5] = new Category(6, "Tea", "Traditional and herbal teas");

        Product[] productArray = new Product[28];
        productArray[0] = new Product(1, "카라멜마끼아또", 1, 5000);
        productArray[1] = new Product(2, "홍차라떼", 2, 5000);
        productArray[2] = new Product(3, "초코라떼", 2, 5000);
        productArray[3] = new Product(4, "오레오", 3, 5000);
        productArray[4] = new Product(5, "카라멜마끼아또", 1, 5000);
        productArray[5] = new Product(6, "초코라떼", 2, 4500);
        productArray[6] = new Product(7, "복숭아스무디", 4, 5000);
        productArray[7] = new Product(8, "커피콩빵", 5, 3000);
        productArray[8] = new Product(9, "바니라라떼", 1, 5000);
        productArray[9] = new Product(10, "매실차", 6, 4500);
        productArray[10] = new Product(11, "깔라만시", 6, 4500);
        productArray[11] = new Product(12, "카페라떼", 1, 4000);
        productArray[12] = new Product(13, "헤이즐넛라떼", 1, 5000);
        productArray[13] = new Product(14, "카라멜마끼아또", 1, 5000);
        productArray[14] = new Product(15, "아메리카노", 1, 4000);
        productArray[15] = new Product(16, "캐모마일", 6, 4500);
        productArray[16] = new Product(17, "아포가또", 3, 5500);
        productArray[17] = new Product(18, "비엔나커피", 1, 5000);
        productArray[18] = new Product(19, "베이글", 5, 3500);
        productArray[19] = new Product(20, "카푸치노", 1, 4000);
        productArray[20] = new Product(21, "허니브레드", 5, 6000);
        productArray[21] = new Product(22, "카페모카", 1, 5000);
        productArray[22] = new Product(23, "얼그레이", 6, 4500);
        productArray[23] = new Product(24, "히비아이스트", 3, 5000);
        productArray[24] = new Product(25, "플레인 와플", 5, 6000);
        productArray[25] = new Product(26, "요거트", 3, 5500);
        productArray[26] = new Product(27, "유자스무디", 4, 5000);
        productArray[27] = new Product(28, "딸기스무디", 4, 5000);


        Order[] orders = new Order[74];
        orders[0] = new Order(38167668, "2017-09-13 10:15", 1, 1, 1);
        orders[1] = new Order(89217297, "2017-09-13 10:20", 2, 12, 1);
        orders[2] = new Order(39178816, "2017-09-13 10:40 ", 3, 13, 1);
        orders[3] = new Order(63105816, "2017-09-13 10:05 ", 4, 14, 1);
        orders[4] = new Order(47018158, "2017-09-13 11:15 ", 5, 15, 1);
        orders[5] = new Order(46078737, "2017-09-13 11:25 ", 6, 16, 1);
        orders[6] = new Order(32215456, "2017-09-13 11:35 ", 7, 17, 1);
        orders[7] = new Order(60728464, "2017-09-13 11:45 ", 8, 18, 1);
        orders[8] = new Order(99145980, "2017-09-13 11:50 ", 9, 10, 1);
        orders[9] = new Order(65700654, "2017-09-13 12:00", 8, 2, 1);
        orders[10] = new Order(65700654, "2017-09-13 12:00", 7, 3, 1);
        orders[11] = new Order(65700654, "2017-09-13 12:00", 6, 4, 1);
        orders[12] = new Order(65700654, "2017-09-13 12:00", 5, 5, 1);
        orders[13] = new Order(54449843, "2017-09-13 12:10", 4, 6, 1);
        orders[14] = new Order(66578200, "2017-09-13 12:15", 3, 7, 1);
        orders[15] = new Order(79287280, "2017-09-13 12:35", 3, 8, 1);
        orders[16] = new Order(56679560, "2017-09-13 12:50", 6, 11, 1);
        orders[17] = new Order(39865396, "2017-09-13 12:55", 4, 12, 1);
        orders[18] = new Order(49791945, "2017-09-13 13:15", 6, 13, 1);
        orders[19] = new Order(49791945, "2017-09-13 13:15", 8, 14, 1);
        orders[20] = new Order(49791945, "2017-09-13 13:15", 11, 15, 1);
        orders[21] = new Order(49791945, "2017-09-13 13:15", 12, 2, 1);
        orders[22] = new Order(73592627, "2017-09-13 13:30", 13, 2, 1);
        orders[23] = new Order(57111296, "2017-09-13 13:45", 14, 2, 1);
        orders[24] = new Order(57111296, "2017-09-13 13:45", 15, 3, 1);
        orders[25] = new Order(57111296, "2017-09-13 13:45", 16, 3, 1);
        orders[26] = new Order(57111296, "2017-09-13 13:45", 17, 3, 1);
        orders[27] = new Order(69598408, "2017-09-13 13:05", 18, 3, 1);
        orders[28] = new Order(69598408, "2017-09-13 13:05", 19, 4, 1);
        orders[29] = new Order(69598408, "2017-09-13 13:05", 20, 4, 1);
        orders[30] = new Order(69598408, "2017-09-13 13:05", 23, 5, 1);
        orders[31] = new Order(67173436, "2017-09-13 14:30", 22, 6, 1);
        orders[32] = new Order(67173436, "2017-09-13 14:30", 23, 7, 1);
        orders[33] = new Order(67173436, "2017-09-13 14:30", 24, 8, 1);
        orders[34] = new Order(67173436, "2017-09-13 14:30", 25, 9, 1);
        orders[35] = new Order(36320862, "2017-09-13 14:35", 26, 1, 1);
        orders[36] = new Order(71781108, "2017-09-13 14:05", 27, 2, 1);
        orders[37] = new Order(55756203, "2017-09-13 14:55", 28, 3, 1);
        orders[38] = new Order(55756203, "2017-09-13 14:55", 19, 4, 1);
        orders[39] = new Order(55756203, "2017-09-13 14:55", 20, 5, 1);
        orders[40] = new Order(55756203, "2017-09-13 14:55", 22, 6, 1);
        orders[41] = new Order(22817525, "2017-09-13 15:00", 23, 7, 1);
        orders[42] = new Order(55183914, "2017-09-13 15:15", 11, 8, 1);
        orders[43] = new Order(39118494, "2017-09-13 15:40", 12, 9, 1);
        orders[44] = new Order(56152549, "2017-09-13 15:45", 13, 1, 1);
        orders[45] = new Order(44004393, "2017-09-13 16:45", 14, 1, 1);
        orders[46] = new Order(57522351, "2017-09-13 16:55", 15, 2, 1);
        orders[47] = new Order(57522351, "2017-09-13 16:55", 17, 2, 1);
        orders[48] = new Order(57522351, "2017-09-13 16:55", 19, 2, 1);
        orders[49] = new Order(57522351, "2017-09-13 16:55", 29, 3, 1);
        orders[50] = new Order(97267860, "2017-09-13 17:40", 28, 3, 1);
        orders[51] = new Order(23534034, "2017-09-13 17:55", 27, 3, 1);
        orders[52] = new Order(91629257, "2017-09-13 18:20", 26, 3, 1);
        orders[53] = new Order(37776984, "2017-09-13 19:15", 25, 4, 1);
        orders[54] = new Order(46888645, "2017-09-13 19:20", 24, 4, 1);
        orders[55] = new Order(47293154, "2017-09-13 19:25", 13, 4, 1);
        orders[56] = new Order(34402591, "2017-09-13 20:25", 1, 4, 1);
        orders[57] = new Order(75967086, "2017-09-13 20:45", 2, 4, 1);
        orders[58] = new Order(41288267, "2017-09-13 20:55", 3, 5, 1);
        orders[59] = new Order(38559076, "2017-09-13 21:25", 4, 5, 1);
        orders[60] = new Order(16229001, "2017-09-13 21:40", 5, 5, 1);
        orders[61] = new Order(59480814, "2017-09-13 22:00", 14, 5, 1);
        orders[62] = new Order(96791246, "2017-09-13 22:10", 15, 12, 1);
        orders[63] = new Order(50021775, "2017-09-13 22:35", 16, 10, 1);
        orders[64] = new Order(55861805, "2017-09-13 22:40", 17, 12, 1);
        orders[65] = new Order(68585789, "2017-09-13 22:50", 18, 13, 1);
        orders[66] = new Order(92127744, "2017-09-13 22:55", 21, 1, 1);
        orders[67] = new Order(92127744, "2017-09-13 22:55", 22, 2, 1);
        orders[68] = new Order(92127744, "2017-09-13 22:55", 23, 3, 1);
        orders[69] = new Order(92127744, "2017-09-13 22:55", 24, 4, 1);
        orders[70] = new Order(94113278, "2017-09-13 23:15", 15, 5, 1);
        orders[71] = new Order(17708771, "2017-09-13 23:20", 16, 6, 1);
        orders[72] = new Order(71621027, "2017-09-13 23:25", 17, 7, 1);
        orders[73] = new Order(49305845, "2017-09-13 23:45", 12, 8, 1);

        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee(201, "Alice", "사원", 30000);
        employeeArray[1] = new Employee(202, "Bob", "대리", 40000);
        employeeArray[2] = new Employee(203, "Charlie", "과장", 50000);
        employeeArray[3] = new Employee(204, "David", "사원", 32000);
        employeeArray[4] = new Employee(205, "Eve", "대리", 42000);


        while (true) {
            label86:
            while (true) {
                System.out.println("궁금하신 사항을 입력하세요(1:카테고리, 2:상품정보, 3:주문정보, 4:직원정보, 0:종료):");
                int SChoice = sc.nextInt();
                int selectedProductNum;
                int OrderChoice1;
                PrintStream var10000;
                int var10001;
                switch (SChoice) {
                    case 1:
                        System.out.print("카테고리번호\t카테고리명\t\t카테고리설명\n");
                        Category[] var26 = categories;
                        OrderChoice1 = categories.length;

                        for (selectedProductNum = 0; selectedProductNum < OrderChoice1; ++selectedProductNum) {
                            Category catego = var26[selectedProductNum];
                            var10000 = System.out;
                            var10001 = catego.getCtgNum();
                            var10000.print("" + var10001 + "\t\t\t " + catego.getCtgName() + "\t\t\t " + catego.getCtgExpn() + "\n");
                        }

                        System.out.println("============================================================");
                        break;
                    case 2:
                        System.out.println("============================================================");
                        System.out.println("상품번호\t\t\t상품명\t\t\t카테고리번호\t\t\t판매단가\n");
                        ProductData[] var23 = productdatas;
                        OrderChoice1 = productdatas.length;

                        for (selectedProductNum = 0; selectedProductNum < OrderChoice1; ++selectedProductNum) {
                            ProductData pdata = var23[selectedProductNum];
                            var10000 = System.out;
                            var10001 = pdata.getProductNum();
                            var10000.println("" + var10001 + "\t\t\t\t " + pdata.getProductName() + "\t\t\t\t " + pdata.getCtgNum() + "\t\t\t\t " + pdata.getProductPrice());
                        }

                        System.out.println("============================================================");
                        System.out.println("상품설명은 1번, 주문은 2번을 눌러주세요\n");
                        int ProductOption = sc.nextInt();
                        int var11;
                        int quantity;
                        int totalPrice;
                        switch (ProductOption) {
                            case 1:
                                System.out.println("============================================================");
                                System.out.println("조회할 상품번호를 입력하세요");
                                selectedProductNum = sc.nextInt();
                                ProductData[] var27 = productdatas;
                                var11 = productdatas.length;
                                int var25 = 0;

                                while (true) {
                                    if (var25 >= var11) {
                                        continue label86;
                                    }

                                    ProductData pdata = var27[var25];
                                    if (pdata.getProductNum() == selectedProductNum) {
                                        Category[] var16 = categories;
                                        totalPrice = categories.length;

                                        for (quantity = 0; quantity < totalPrice; ++quantity) {
                                            Category catego = var16[quantity];
                                            if (catego.getCtgNum() == pdata.getCtgNum()) {
                                                System.out.println();
                                                System.out.println("" + selectedProductNum + "번 " + pdata.getProductName() + " 상품을 선택하셨습니다.");
                                                System.out.print("----------------------------------------------------------------------------------------------\n");
                                                System.out.print("카테고리번호\t카테고리명\t\t카테고리설명\n");
                                                var10000 = System.out;
                                                var10001 = catego.getCtgNum();
                                                var10000.println("" + var10001 + "\t\t\t" + catego.getCtgName() + "\t\t\t" + catego.getCtgExpn());
                                                break;
                                            }
                                        }
                                    }

                                    ++var25;
                                }
                            case 2:
                                System.out.println("상품번호를 선택하세요:");
                                OrderChoice1 = sc.nextInt();
                                ProductData[] var13 = productdatas;
                                int var12 = productdatas.length;

                                for (var11 = 0; var11 < var12; ++var11) {
                                    ProductData pdata = var13[var11];
                                    if (pdata.getProductNum() == OrderChoice1) {
                                        System.out.println("주문수량을 선택하세요:");
                                        quantity = sc.nextInt();
                                        quantity = Math.max(quantity, 1);
                                        totalPrice = pdata.getProductPrice() * quantity;
                                        System.out.println("상품명 : " + pdata.getProductName() + " , 수량 : " + quantity + "개, 결제금액은 " + totalPrice + "입니다");
                                    }
                                }

                                System.out.println("============================================================");
                                continue;
                            default:
                                System.out.println("올바른 번호를 입력해주세요.");
                                continue;
                        }
                    case 3:
                        System.out.print("주문번호\t\t\t주문시각\t\t\t\t주문처리\t\t상품ID\t\t\t주문수량\n");
                        Order[] var21 = orders;
                        OrderChoice1 = orders.length;

                        for (selectedProductNum = 0; selectedProductNum < OrderChoice1; ++selectedProductNum) {
                            Order ords = var21[selectedProductNum];
                            var10000 = System.out;
                            var10001 = ords.getOrderNum();
                            var10000.print("" + var10001 + "\t\t\t" + ords.getOrderTime() + "\t\t\t " + ords.getOrderId() + "\t\t\t " + ords.getProductId() + "\t\t\t " + ords.getQuantity() + "\n");
                        }

                        System.out.println("============================================================");
                        break;
                    case 4:
                        System.out.println("사원번호\t\t사원이름\t\t\t직급\t\t\t급여");
                        Employee[] var10 = employees;
                        OrderChoice1 = employees.length;

                        for (selectedProductNum = 0; selectedProductNum < OrderChoice1; ++selectedProductNum) {
                            Employee emp = var10[selectedProductNum];
                            var10000 = System.out;
                            var10001 = emp.getEmployeeId();
                            var10000.println("" + var10001 + "\t\t\t" + emp.getEmployeeName() + "\t\t\t\t" + emp.getEmployeePosition() + "\t\t\t" + emp.getEmployeeSalary());
                        }

                        System.out.println("============================================================");
                }
            }
        }
    }
}
        */

                }
                }
