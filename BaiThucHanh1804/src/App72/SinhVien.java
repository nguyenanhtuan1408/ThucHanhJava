package App72;

public class SinhVien {
    private String ten;
    private String tuoi;
    
    public String getTen() {
        return ten;
    }
    
    public void setTen(String ten) {
        if (ten == null || ten.isEmpty()) {
            // Nếu biến ten chưa khởi tạo (mang giá trị null), hoặc biến ten có nội dung rỗng
            // Thì hãy lưu với tên là "Không biết"
            this.ten = "Không biết";
        } else {
            this.ten = ten;
        }
    }

    public String getTuoi() {
        if (Integer.valueOf(tuoi) != -1) {
            // Tuổi hợp lệ
            return tuoi;
        } else {
            return "Tuổi không hợp lệ";
        }
    }

    public void setTuoi(int tuoi) {
        // Kiểm tra tuổi có hợp lý hay không, nếu hợp lý thì lưu vào, nếu không sẽ tìm cách báo lỗi bằng cách lưu giá trị âm
        if (tuoi > 18) {
            this.tuoi = String.valueOf(tuoi);
        } else {
            this.tuoi = String.valueOf(-1);
        }
    }
}
