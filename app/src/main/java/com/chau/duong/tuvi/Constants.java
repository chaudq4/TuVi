package com.chau.duong.tuvi;

public class Constants {
    enum DiaChi {
        temp(0), Tý(1), Sửu(2), Dần(3), Mão(4), Thìn(5), Tị(6), Ngọ(7), Mùi(8), Thân(9), Dậu(10), Tuất(11), Hợi(12);
        private int value;

        DiaChi(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    enum ThienCan {
        temp(0),Giáp(1), Ất(2), Bính(3), Đinh(4), Mậu(5), Kỷ(6), Canh(7), Tân(8), Nhâm(9), Quý(10);
        private int value;

        ThienCan(int value) {
            this.value = value;
        }
    }

    enum AmDuong {
        Âm, Dương
    }

    enum NguHanh {
        Kim, Mộc, Thổ, Thủy, Hỏa
    }

    enum CungTuVi {
        Mệnh, Phụ_mẫu, Phúc_đức, Điền_trạch, Quan_lộc, Nô_bộc, Thiên_di, Tật_ách, Tài_bạch, Tử_tức, Phu_thê, Huynh_đệ, Thân
    }

    enum Cuc {
        Thủy_nhị_cục, Mộc_tam_cục, Kim_tứ_cục, Thổ_ngũ_cục, Hỏa_lục_cục
    }

    enum TuHoa {
        Hóa_lộc, Hóa_khoa, Hóa_quyền, Hóa_ky
    }

    enum VongTuVi {
        Tử_vi, Thiên_phủ, Thiên_đồng, Thái_dương, Thái_âm, Thiên_cơ, Thiên_tướng, Thất_sát, Tham_lang, Phá_quân, Thiên_lương, Vũ_khúc, Cự_môn, Liêm_trinh
    }

    enum VongThaiTue {
        Thái_tuế, Thiếu_dương, Tang_môn, Thiếu_âm, Quan_phù, Tử_phù, Tuế_phá, Long_đức, Bạch_hổ, Phúc_đức, Điếu_khách, Trực_phù, Thiên_không, Thiên_đức, Nguyệt_đức
    }

    enum VongLocTon {
        Lộc_tồn, Bác_sỹ, Lực_sỹ, Thanh_long, Tiểu_hao, Tướng_quân, Tấu_thư, Phi_liêm, Hỷ_thần, Bệnh_phù, Đại_hao, Phục_binh, Quan_phủ
    }

    enum VongTrangSinh {
        Tràng_sinh, Mộc_dục, Quan_đới, Lâm_quan, Đế_vượng, Suy, Bệnh, Tử, Mộ, Tuyệt, Thai, Dưỡng
    }

    enum PhuTinh {
        Thiên_khôi, Thiên_việt, Long_trì, Phượng_các, Giải_thần, Tam_thai, Bát_tọa, Ân_quang, Thiên_quý, Thiên_khốc, Thiên_hư, Thiên_tài, Thiên_thọ, Hồng_loan, Thiên_hỷ,
        Thiên_hình, Thiên_riêu, Thiên_y, Cô_thần, Quả_tú, Lưu_niên, Quốc_ấn, Đường_phù, Thai_phụ, Phong_cáo, Thiên_giải, Địa_giải, Thiên_la, Địa_võng, Thiên_thương, Thiên_sứ,
        Thiên_mã, Hoa_cái, Kiếp_sát, Đào_hoa, Phá_toái, Đẩu_quân, Thiên_trù, Lưu_hà
    }

    enum LucSatTinh {
        Kình_dương, Đà_la, Địa_không, Địa_kiếp, Hỏa_linh, Linh_tinh
    }

    enum TuanTriet {
        Tuần_trung, Triệt_lộ
    }

    enum NamNu {
        Nam, Nữ
    }

}
