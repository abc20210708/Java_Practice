package Project;


import java.util.Scanner;

public class pro {

    static Scanner sc = new Scanner(System.in);
    //초기 자료(DummyData)
    static String[] bookList = {"작별하지 않는다.", "인생은 실전이다.", "달러구트 꿈 백화점.2", "달러구트 꿈 백화점", "소크라테스 익스프레스",
            "오늘 밤, 세계에서 이 사랑이 사라진", "햇빛은 찬란하고 인생은 귀하니까", "럭키", "미드나잇 라이브러리", "백조와 박쥐"}; // 초기 도서명 리스트
    static int[] bookStock = {0,1,2,3,3,2,1,3,3,2}; // 초기 도서 재고
    static String[] bookIdx = {"B001", "B002", "B003", "B004", "B005", "B006", "B007", "B008", "B009", "B010"}; // 초기 도서 색인번호
    static String[] rentalBookList = {"작별하지 않는다.", "인생은 실전이다."}; // 초기 대여중인 도서
    static String[] rentalUserList = {"유재석", "이수근"}; // 초기 도서 대여중인 회원
    static int count = 3; // 초기 회원 수
    static String[] userIdList= {"A009", "A011", "A112"};   // 회원번호
    static String[] userNameList = {"유재석", "강호동", "이수근"}; // 회원이름
    static String[] userBirthList = {"720814", "700611", "750210"};  // 회원생년월일


    // 화면 초기화
    public static void clearScreen() {
        for (int i = 0; i < 80; i++)
            System.out.println("");
    }

    public static void showBookList(int currentPage) {
        // 전체 페이지 출력(출력 범위 산정은 ceil(올림)함수로 홀수화 처리)
        int page = (int) Math.ceil(bookList.length / 3.0);
        // 표시할 목록 기준 처리
        int startNum = 3 * (currentPage - 1);
        int endNum = 3 * currentPage;
        if (currentPage == page) {
            endNum = bookList.length;
        }
        System.out.println("=========================================");
        System.out.println("============ 현재 도서 목록 ==============");
        System.out.println("=========================================");
        System.out.println("== | 번호 | 도서명 | 현재 재고 | 도서 번호==");
        System.out.println("=========================================");
        for (int i = startNum; i < endNum; i++) {
            System.out.printf("%d | %s | %2d권 | %s\n", i + 1, bookList[i], bookStock[i], bookIdx[i]);
        }
    }

    public static void addBook() {
        System.out.println("# 추가할 도서명을 입력하세요.");
        System.out.print(">>");
        String newBook = sc.nextLine();
        System.out.println("# 추가할 도서번호를 입력하세요.");
        System.out.print(">>");
        String tempBookIdx = sc.nextLine();
        System.out.println("# 도서 권수를 입력하세요.");
        System.out.print(">>");
        int newBookStock = sc.nextInt();
        sc.nextLine();
        // 주의!! 스캐너 nextLine();함수 마지막 스캐너 처리값으로 String타입으로 받으면 처리되지 못함
        System.out.printf("# %s(%d권-%s) 를 등록하시겠습니까?\n", newBook, newBookStock, tempBookIdx);
        System.out.println("# Enter - 등록 | 0 - 취소");
        System.out.print(">>");
        if(sc.nextLine().equals("0")) return;
        // 임시 배열 생성(기존 배열 +1)
        String[] temp = new String[bookList.length +1];
        int[] temp1 = new int[bookStock.length +1];
        String[] temp2 = new String[bookIdx.length +1];
        // 스캐너로 받은 값 인덱스 반복문 돌려서 각각에 맞게 새로 저장
        for (int i = 0; i < temp.length -1; i++) {
            temp[i] = bookList[i];
            temp1[i] = bookStock[i];
            temp2[i] = bookIdx[i];
        }
        temp[temp.length - 1] = newBook;
        temp1[temp1.length - 1] = newBookStock;
        temp2[temp2.length - 1] = tempBookIdx;
        // 기존 배열로 복사
        bookList = temp;
        bookStock = temp1;
        bookIdx = temp2;
    }

    public static int checkBookIdx(String searchBookIdx) {
        // 초기 번호 값 설정
        int idx = -1;
        // 도서번호 값 매칭
        for (int i = 0; i < bookIdx.length; i++) {
            if (searchBookIdx.equals(bookIdx[i])) { // 입력받은 도서번호와 기존 도서번호 일치시 값반환
                idx = i;
                break;
            }
        }
        return idx;
    }

    public static void removeBook() {
        while (true) {
            System.out.println("# 삭제할 도서번호를 입력하세요!");
            System.out.print(">>");
            String removeBookIdx = sc.nextLine();

            int idx = checkBookIdx(removeBookIdx);

            if (idx == -1) {
                System.out.println("# 없는 도서입니다.");
            } else {
                System.out.println("# " + bookList[idx] + "을(를) 삭제하시겠습니까?");
                System.out.println("# Enter - 등록 | 0 - 취소 ");
                System.out.print(">>");
                if (sc.nextLine().equals("0")) return;

                for (int i = idx; i < bookList.length - 1; i++) {
                    bookList[i] = bookList[i + 1];
                    bookStock[i] = bookStock[i + 1];
                    bookIdx[i] = bookIdx[i + 1];
                }

                String[] temp = new String[bookList.length - 1];
                int[] temp1 = new int[bookStock.length - 1];
                String[] temp2 = new String[bookIdx.length -1];
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = bookList[i];
                    temp1[i] = bookStock[i];
                    temp2[i] = bookIdx[i];
                }
                bookList = temp;
                bookStock = temp1;
                bookIdx = temp2;
                return;
            }

        }
    }

    public static void manageBook() {
        int currentPage = 1;
        while (true) {
            clearScreen();
            showBookList(currentPage);
            System.out.println("");
            System.out.println("");
            System.out.println("++++++++++++++++도서 관리+++++++++++++++++");
            System.out.println("==|1.도서추가|2.도서제거|0.메인화면이동|==");
            System.out.println("==|7.이전페이지|#목록 이동|9.다음페이지|==");
            System.out.println("========================================");
            System.out.print(">>");
            int menuStatus = sc.nextInt();
            sc.nextLine();

            switch (menuStatus) {
                case 1:
                    System.out.println("도서 추가 화면입니다.");
                    addBook();
                    break;
                case 2:
                    System.out.println("도서 삭제 화면입니다.");
                    removeBook();
                    break;
                case 7:
                    if(currentPage == 1) { // 만약 현재 페이지가 가장 첫페이지면 바로 브레이크
                        break;
                    }
                    currentPage--; // 아니라면 이전 페이지 후위감소 실행
                    break;
                case 9:
                    if(currentPage == (int) Math.ceil(bookList.length / 3.0)) { // 만약 현재 페이지가 마지막 페이지면 바로 브레이크
                        break;
                    }
                    currentPage++; // 아니라면 다음 페이지 후위증가 실행
                    break;
                case 0:
                    return;
                default:
                    System.out.println("올바르지 못한 메뉴 선택입니다.");
            }
        }
    }

    static void searchBook() {
        int index = searchBookIdx(inputBookNum("조회"));
        if (index >= 0) {
            System.out.println("====== 검색된 정보 ======");
            System.out.println("# 도서명: " + bookList[index]);
            System.out.println("# 재고: " + bookStock[index]);
            System.out.println("# 도서번호: " + bookIdx[index]);
            System.out.println("=========================\n");
            System.out.println();
            System.out.println();
            System.out.println();
        } else {
            System.out.println("조회하신 도서정보는 존재하지 않습니다.");
        }
    }

    static int searchBookIdx(String bookNum) {
        int idx;
        for (idx = 0; idx < count; idx++) {
            if (bookNum.equals(bookIdx[idx])) {
                return idx;
            }
        }
        return -1;
    }

    static String inputBookNum(String data) {
        System.out.printf("%s하실 도서번호를 입력하세요.\n", data);
        System.out.print(">> ");
        return sc.next();
    }

    public static void manageSearch() {
        int menuNum = 0;
        clearScreen();
        while (true) {
            System.out.println("========================================");
            System.out.println("++++++++++++++++도서 검색++++++++++++++++");
            System.out.println("=========|1.검색하기|0.메인화면이동|======");
            System.out.println("========================================");
            System.out.print(">>");
            menuNum = sc.nextInt();
            sc.nextLine();

            switch (menuNum) {
                case 1:
                    searchBook();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("올바르지 못한 메뉴 선택입니다.");
            }
        }
    }

    public static void showRentalList(int currentPage) {

        int page = (int) Math.ceil(rentalBookList.length / 3.0);

        int startNum = 3 * (currentPage - 1);
        int endNum = 3 * currentPage;
        if (currentPage == page) {
            endNum = rentalBookList.length;
        }

        clearScreen();
        System.out.println("=========================================");
        System.out.println("============ 현재 대여 목록 ==============");
        System.out.println("=========================================");
        System.out.println("======= | 번호 | 도서명 | 대여자 | ========");
        System.out.println("=========================================");
        for (int i = startNum; i < endNum; i++) {
            System.out.printf("%d  | %-10s - %5s |\n", i + 1, rentalBookList[i], rentalUserList[i]);
        }
    }

    public static int checkUser (String inputId) {
        for (int i = 0; i < userIdList.length; i++) {
            if (inputId.equals(userIdList[i])) {
                return i;
            }
        }
        return -1;
    }

    public static void rentalBook() {

        while (true) {
            System.out.println("# 대여자 회원 번호를 입력하세요.");
            System.out.print(">>");
            String enoNum = sc.nextLine();

            int rentalIdx = checkUser(enoNum);

            if (rentalIdx == -1) {
                System.out.println("# 존재하지 않는 회원입니다.");
                continue;
            }

            System.out.println("# 대여할 도서번호를 입력하세요.");
            System.out.print(">>");
            String rentalBook = sc.nextLine();
            int bookIdx = checkBookIdx(rentalBook);
            if (bookIdx == -1) {
                System.out.println("없는 도서번호 입니다. 다시 확인하시고 입력하세요.");
                continue;
            } else {
                if (bookStock[bookIdx] <= 0) {
                    System.out.println("# 현재 대여 가능한 도서가 아닙니다.");
                    continue;
                } else {
                    System.out.printf("# %s님께 %s(을)를 대여하시겠습니까?\n", userNameList[rentalIdx], bookList[bookIdx]);
                    System.out.println("# Enter - 등록 | 0 - 취소 ");
                    System.out.print(">>");
                    if (sc.nextLine().equals("0")) continue;

                    String[] rentalBookTemp = new String[rentalBookList.length + 1];
                    String[] rentalUserTemp = new String[rentalUserList.length + 1];

                    for (int i = 0; i < rentalBookTemp.length - 1; i++) {
                        rentalBookTemp[i] = rentalBookList[i];
                        rentalUserTemp[i] = rentalUserList[i];
                    }

                    rentalBookTemp[rentalBookTemp.length - 1] = bookList[bookIdx];
                    rentalUserTemp[rentalUserTemp.length - 1] = userNameList[rentalIdx];

                    rentalBookList = rentalBookTemp;
                    rentalUserList = rentalUserTemp;
                    bookStock[bookIdx]--;
                    return;

                }
            }
        }
    }

    public static void manageRental() {
        int currentPage = 1;

        while (true) {
            showRentalList(currentPage);
            System.out.println("");
            System.out.println("");
            System.out.println("++++++++++++++++대여 관리+++++++++++++++++");
            System.out.println("========|1.대여하기|0.메인화면이동|=======");
            System.out.println("===|7.이전페이지|#목록 이동|9.다음페이지|===");
            System.out.println("========================================");
            System.out.print(">>");
            int menuStatus = sc.nextInt();
            sc.nextLine();

            switch (menuStatus) {
                case 1:
                    System.out.println("대여 하기 화면입니다.");
                    rentalBook();
                    break;
                case 7:
                    if(currentPage == 1) {
                        break;
                    }
                    currentPage--;
                    break;
                case 9:
                    if(currentPage == (int) Math.ceil(bookList.length / 3.0)) {
                        break;
                    }
                    currentPage++;
                    break;
                case 0:
                    return;
                default:
                    System.out.println("올바르지 못한 메뉴 선택입니다.");
            }
        }
    }

    //배열 추가 기능을 수행하는 메서드
    static String[] append(String[] arr, String data) {
        //배열의 사이즈를 1 증가시킴
        String[] temp = new String[count + 1];
        for (int i=0; i < count; i++) {
            temp[i] = arr[i];
        }
        //새로운 데이터를 추가
        temp[temp.length - 1] = data;
        return temp;
    }

    //회원 번호 중복을 체크하는 메서드
    static String checkDuplicateEmpNum() {

        //첫 회원번호 입력
        String empNum = sc.next();

        //중복 검사
        while (true) {
            //flag가 true면 중복되었음을 의미
            boolean flag = false;
            for (int i=0; i < userIdList.length; i++) {
                if (empNum.equals(userIdList[i])) {
                    //사번이 중복된 경우
                    flag = true;
                    System.out.println("이미 등록된 회원번호입니다.");
                    System.out.print("- 회원번호 재입력: ");
                    empNum = sc.next();
                    break;
                }
            }
            //사번 중복이 안된 경우
            if (!flag) {
                return empNum;
            }
        }
    }

    //회원 정보 등록을 위한 메서드
    private static void enoInsert() {
        System.out.println("# 회원 정보 등록을 시작합니다.");
        System.out.print("- 회원번호: ");
        String eno = checkDuplicateEmpNum();//sc.next();
        sc.nextLine();
        System.out.print("- 이름: ");
        String name = sc.next();
        sc.nextLine();
        System.out.print("- 생년월일: ");
        String age = sc.nextLine();
        System.out.println(name + "님의 정보가 정상 등록 되었습니다.");


        //배열 사이즈를 증가시키고 데이터를 추가하는 함수
        userIdList = append(userIdList, eno);
        userNameList = append(userNameList, name);
        userBirthList = append(userBirthList, age);
        count++;

    }


    // 사원번호로 데이터배열의 인덱스를 찾아서 리턴하는 메서드
    static int searchIndex(String empNumber) {
        int idx;
        for (idx = 0; idx < count; idx++) {
            if (empNumber.equals(userIdList[idx])) {
                return idx;
            }
        }
        return -1;
    }

    // 사원 번호를 입력받아 리턴하는 메서드
    static String inputEmpNumber(String data) {
        System.out.printf("%s하실 회원번호를 입력하세요.\n", data);
        System.out.print("> ");
        return sc.next();
    }

    // 사원 개별 조회를 수행하는 메서드
    static void searchEmpData() {
        int index = searchIndex(inputEmpNumber("조회"));
        if (index >= 0) {
            System.out.println("====== 검색된 정보 ======");
            System.out.println("# 회원번호: " + userIdList[index]);
            System.out.println("# 이름: " + userNameList[index]);
            System.out.println("# 생년월일: " + userBirthList[index]);
            System.out.println("=========================\n");
        } else {
            System.out.println("조회하신 회원정보는 존재하지 않습니다.");
        }
    }

    // 배열 삭제 메서드
    static String[] remove(String[] arr, int index) {
        for (int i=index; i < count-1; i++) {
            arr[i] = arr[i+1];
        }
        //배열 복사
        String[] temp = new String[arr.length-1];
        for (int i=0; i < temp.length; i++) {
            temp[i] = arr[i];
        }

        return temp;
    }

    // 사원 정보 삭제 세부처리 메서드
    static void processDel(int index) {
        //삭제될 데이터의 이름정보 복사
        String delName = userNameList[index];

        userIdList = remove(userIdList, index);
        userNameList = remove(userNameList, index);
        userBirthList = remove(userBirthList, index);
        count--;

        System.out.printf("# %s님의 정보가 정상 삭제되었습니다.\n", delName);
    }

    // 사원 정보 삭제를 수행하는 메서드
    static void deleteEmpData() {
        String empNumber = inputEmpNumber("삭제");
        int index = searchIndex(empNumber);
        if (index >= 0) {
            System.out.printf("# %s님의 회원정보를 삭제합니다.[y/n]\n", userNameList[index]);
            System.out.print("> ");
            String trigger = sc.next();
            switch (trigger) {
                case "y": case "Y": case "ㅛ":
                    processDel(index);
                    break;
                case "n": case "N": case "ㅜ":
                    System.out.println("# 정보 삭제를 취소합니다.");
                    break;
            }
        } else {
            System.out.println("조회하신 회원정보는 존재하지 않습니다.");
        }
    }

    public  static  void mainMenu() {
        int menuStatus = 0;
        while (true) {
            System.out.println("=================================");
            System.out.println("+++++++++도서 관리 프로그램+++++++++");
            System.out.println("=================================");
            System.out.println("=|1.도서관리|2.도서검색|3.도서대여|=");
            System.out.println("=|4.회원등록|5.회원검색|6.회원삭제|=");
            System.out.println("=========|0.프로그램 종료|=========");
            System.out.print(">>");
            menuStatus = sc.nextInt();
            sc.nextLine();

            switch (menuStatus) {
                case 1:
                    System.out.println("현재 도서관리 메뉴입니다.");
                    manageBook();
                    break;
                case 2:
                    System.out.println("현재 도서검색 메뉴입니다.");
                    manageSearch();
                    break;
                case 3:
                    System.out.println("현재 대여확인 메뉴입니다.");
                    manageRental();
                    break;
                case 4:
                    System.out.println("현재 회원등록 메뉴입니다.");
                    enoInsert();
                    break;
                case 5:
                    System.out.println("현재 회원검색 메뉴입니다.");
                    searchEmpData();
                    break;
                case 6:
                    System.out.println("현재 회원삭제 메뉴입니다.");
                    deleteEmpData();
                    break;
                case 0:
                    System.out.println("현재 프로그램 종료 메뉴입니다.");
                    return;
                default:
                    System.out.println("올바르지 못한 메뉴 선택입니다.");
            }
        }
    }

    public static void main(String[] args) {
        mainMenu();
        sc.close();
    }
}