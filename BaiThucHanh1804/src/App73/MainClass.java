package App73;

public class MainClass {
    public static void main(String[] args) {
        // Các thuộc tính x, y này chỉ được truy xuất đến thông qua thể hiện toaDo1 của lớp ToaDo
        ToaDo toaDo1 = new ToaDo();
        toaDo1.x = 10;
        toaDo1.y = 20;
        
        // Các thuộc tính x, y này chỉ được truy xuất đến thông qua thể hiện toaDo2 của lớp ToaDo
        ToaDo toaDo2 = new ToaDo();
        toaDo2.x = 5;
        toaDo2.y = 6;
        
        // Thuộc tính thongTin lại được truy xuất đến thông qua lớp ToaDo
        ToaDo.thongTin = "Lưu tọa độ các hình học";
    }
}
