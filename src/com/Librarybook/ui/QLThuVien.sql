
CREATE DATABASE [QLThuVien]
GO 

USE [QLThuVien]
GO

SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CTPhieuMuon](
	[MaPM] [nvarchar](10) NOT NULL,
	[MaSach] [nvarchar](50) NOT NULL,
	[NgayTra] [date] NULL,
	[TinhTrangSach] [nvarchar](50) NULL,
	[TienPhat] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaPM] ASC,
	[MaSach] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TheLoaiSach](
	[MaTheLoai] [nvarchar](50) NOT NULL,
	[TenTheLoai] [nvarchar](50) NULL,

PRIMARY KEY CLUSTERED 
(
	[MaTheLoai] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[MaNV] [nvarchar](50) NOT NULL,
	[TenNV] [nvarchar](50) NULL,
	[SoDienThoai] [nvarchar](15) NULL,
	[GioiTinh] [bit] NULL,
	[Email] [nvarchar](50) NULL,
	[VaiTro] [bit] NULL,
	[MatKhau] [nvarchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhaXuatBan](
	[MaNXB] [nvarchar](10) NOT NULL,
	[TenNXB] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaNXB] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuMuon](
	[MaPM] [nvarchar](10) NOT NULL,
	[MaNguoiMuon] [nvarchar](50) NOT NULL,
	[NgayMuon] [date] NULL,
	[NgayTra] [date] NULL,
	[SoNgayMuon] [int] NULL,
	[MaNV] [nvarchar](50) NULL,
	[TrangThai] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaPM] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Sach](
	[MaSach] [nvarchar](50) NOT NULL,
	[TenSach] [nvarchar](50) NULL,
	[MaTheLoai] [nvarchar](50) NULL,
	[MaTacGia] [nvarchar](10) NOT NULL,
	[MaNXB] [nvarchar](10) NOT NULL,
	[SoLuong] [int] NULL,
	[NoiDung] [nvarchar](max) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaSach] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
CREATE TABLE [dbo].[TacGia](
	[MaTacGia] [nvarchar](10) NOT NULL,
	[TenTacGia] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaTacGia] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NguoiMuon](
[MaNguoiMuon] [nvarchar](50) NOT NULL,
[TenNguoiMuon] [nvarchar](50) NOT NULL,
[SDT] [int] NULL,
[DiaChi] [nvarchar](max) NULL,
[GioiTinh] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaNguoiMuon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO




INSERT [dbo].[CTPhieuMuon] ([MaPM], [MaSach], [NgayTra], [TinhTrangSach], [TienPhat]) VALUES (N'PM001', N'S001', CAST(N'2021-05-17' AS Date), N'Bình thường', 0)
INSERT [dbo].[CTPhieuMuon] ([MaPM], [MaSach], [NgayTra], [TinhTrangSach], [TienPhat]) VALUES (N'PM002', N'S002', CAST(N'2021-05-18' AS Date), N'Bình thường', 0)
INSERT [dbo].[CTPhieuMuon] ([MaPM], [MaSach], [NgayTra], [TinhTrangSach], [TienPhat]) VALUES (N'PM003', N'S003', NULL, NULL, NULL)
INSERT [dbo].[CTPhieuMuon] ([MaPM], [MaSach], [NgayTra], [TinhTrangSach], [TienPhat]) VALUES (N'PM004', N'S004', CAST(N'2021-05-31' AS Date), N'Bình thường', 0)
INSERT [dbo].[CTPhieuMuon] ([MaPM], [MaSach], [NgayTra], [TinhTrangSach], [TienPhat]) VALUES (N'PM005', N'S005', NULL, NULL, NULL)
INSERT [dbo].[CTPhieuMuon] ([MaPM], [MaSach], [NgayTra], [TinhTrangSach], [TienPhat]) VALUES (N'PM006', N'S004', CAST(N'2021-05-20' AS Date), N'Trễ hạn', 150000)
INSERT [dbo].[CTPhieuMuon] ([MaPM], [MaSach], [NgayTra], [TinhTrangSach], [TienPhat]) VALUES (N'PM007', N'S004', CAST(N'2021-05-31' AS Date), N'Mất sách', 200000)
INSERT [dbo].[CTPhieuMuon] ([MaPM], [MaSach], [NgayTra], [TinhTrangSach], [TienPhat]) VALUES (N'PM008', N'S002', NULL, NULL, NULL)
INSERT [dbo].[CTPhieuMuon] ([MaPM], [MaSach], [NgayTra], [TinhTrangSach], [TienPhat]) VALUES (N'PM009', N'S003', NULL, NULL, NULL)
INSERT [dbo].[CTPhieuMuon] ([MaPM], [MaSach], [NgayTra], [TinhTrangSach], [TienPhat]) VALUES (N'PM010', N'S005', CAST(N'2021-08-19' AS Date), N'Mất sách', 200000)

INSERT [dbo].[PhieuMuon] ([MaPM], [MaNguoiMuon], [NgayMuon], [NgayTra], [SoNgayMuon], [MaNV], [TrangThai]) VALUES (N'PM001', N'NM001', CAST(N'2021-05-10' AS Date), CAST(N'2021-05-17' AS Date), 7, N'nv1', N'Đã trả')
INSERT [dbo].[PhieuMuon] ([MaPM], [MaNguoiMuon], [NgayMuon], [NgayTra], [SoNgayMuon], [MaNV], [TrangThai]) VALUES (N'PM002', N'NM002',CAST(N'2021-05-11' AS Date), CAST(N'2021-05-18' AS Date), 7, N'nv2', N'Đã trả')
INSERT [dbo].[PhieuMuon] ([MaPM], [MaNguoiMuon], [NgayMuon], [NgayTra], [SoNgayMuon], [MaNV], [TrangThai]) VALUES (N'PM003', N'NM003',CAST(N'2021-05-12' AS Date), CAST(N'2021-05-26' AS Date), 14, N'nv3', N'Chưa trả')
INSERT [dbo].[PhieuMuon] ([MaPM], [MaNguoiMuon], [NgayMuon], [NgayTra], [SoNgayMuon], [MaNV], [TrangThai]) VALUES (N'PM004', N'NM004',CAST(N'2021-05-24' AS Date), CAST(N'2021-05-31' AS Date), 7, N'nv4', N'Đã trả')
INSERT [dbo].[PhieuMuon] ([MaPM], [MaNguoiMuon], [NgayMuon], [NgayTra], [SoNgayMuon], [MaNV], [TrangThai]) VALUES (N'PM005', N'NM005',CAST(N'2021-05-24' AS Date), CAST(N'2021-05-31' AS Date), 7, N'nv5', N'Chưa trả')
INSERT [dbo].[PhieuMuon] ([MaPM], [MaNguoiMuon], [NgayMuon], [NgayTra], [SoNgayMuon], [MaNV], [TrangThai]) VALUES (N'PM006', N'NM006',CAST(N'2021-05-10' AS Date), CAST(N'2021-05-17' AS Date), 7, N'nv2', N'Đã Trả')
INSERT [dbo].[PhieuMuon] ([MaPM], [MaNguoiMuon], [NgayMuon], [NgayTra], [SoNgayMuon], [MaNV], [TrangThai]) VALUES (N'PM007', N'NM007',CAST(N'2021-05-11' AS Date), CAST(N'2021-05-18' AS Date), 7, N'nv5', N'Đã Trả')
INSERT [dbo].[PhieuMuon] ([MaPM], [MaNguoiMuon], [NgayMuon], [NgayTra], [SoNgayMuon], [MaNV], [TrangThai]) VALUES (N'PM008', N'NM008',CAST(N'2021-05-18' AS Date), CAST(N'2021-05-25' AS Date), 7, N'nv1', N'Chưa trả')
INSERT [dbo].[PhieuMuon] ([MaPM], [MaNguoiMuon], [NgayMuon], [NgayTra], [SoNgayMuon], [MaNV], [TrangThai]) VALUES (N'PM009', N'NM009',CAST(N'2021-07-13' AS Date), CAST(N'2021-07-22' AS Date), 9, N'nv2', N'Chưa trả')
INSERT [dbo].[PhieuMuon] ([MaPM], [MaNguoiMuon], [NgayMuon], [NgayTra], [SoNgayMuon], [MaNV], [TrangThai]) VALUES (N'PM010', N'NM0010',CAST(N'2021-08-12' AS Date), CAST(N'2021-08-19' AS Date), 7, N'nv1', N'Đã Trả')

INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S001', N'Yêu Em', N'DM006', N'TG031', N'NXB06', 100, N'sách trữ tình')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S0010', N'Vợ Tương lai', N'DM006', N'TG031', N'NXB06', 100, N'sách trữ tình')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S0011', N'Kỹ thuật xử lý tín hiệu điều khiển', N'TL001', N'TG041', N'NXB012', 1, N'Giáo trình này được sử dụng làm tài liệu học tập cho sinh viên các khối ngành kỹ thuật và các ngành có liên quan đến kỹ thuật.')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S0012', N'Bài tập vi điều khiển và PLC', N'DM001', N'TG047', N'NXB NXB012', 4, N'')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S0013', N'Khí cụ điện - kết cấu, sử dụng và sửa chữa', N'DM001', N'TG046', N'NXB012', 2, N'Giáo trình này được sử dụng làm tài liệu học tập cho sinh viên các khối ngành kỹ thuật và các ngành có liên quan đến kỹ thuật.')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S0014', N'Sổ tay chuyên ngành điện', N'DM001', N'TL002', N'NXB012', 2, N'Giáo trình này được sử dụng làm tài liệu học tập cho sinh viên các khối ngành kỹ thuật và các ngành có liên quan đến kỹ thuật.')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S0015', N'Bài tập điều khiển tự động', N'DM001 ', N'TG050', N'NXB012', 1, N'Giáo trình này được sử dụng làm tài liệu học tập cho sinh viên các khối ngành kỹ thuật và các ngành có liên quan đến kỹ thuật.')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S0016', N'Sổ tay máy làm đất và làm đường', N'DM004', N'TG51', N'NXB013', 10, N'Cuốn sách này nhằm hệ thống hóa và trang bị các khái niệm, thông tin cơ bản về các hệ thống kỹ thuật trong công trình cho các sinh viên trong trường Đại học Xây dựng nói riêng cũng như các trường đại học có đạo tạo ngành kỹ thuật xây dựng.')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S0017', N'Móng cọc phân tích và thiết kế', N'DM004', N'TG042', N'NXB013', 4, N'Cuốn sách này nhằm hệ thống hóa và trang bị các khái niệm, thông tin cơ bản về các hệ thống kỹ thuật trong công trình cho các sinh viên trong trường Đại học Xây dựng nói riêng cũng như các trường đại học có đạo tạo ngành kỹ thuật xây dựng.')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S0018', N'Cấu tạo bê tông cốt thép', N'DM004', N'TG043', N'NXB013', 2, N'Cuốn sách này nhằm hệ thống hóa và trang bị các khái niệm, thông tin cơ bản về các hệ thống kỹ thuật trong công trình cho các sinh viên trong trường Đại học Xây dựng nói riêng cũng như các trường đại học có đạo tạo ngành kỹ thuật xây dựng.')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S0019', N'Kết cấu thép - Công trình đặc biệt', N'DM004', N'TG044', N'NXB013', 2, N'Cuốn sách này nhằm hệ thống hóa và trang bị các khái niệm, thông tin cơ bản về các hệ thống kỹ thuật trong công trình cho các sinh viên trong trường Đại học Xây dựng nói riêng cũng như các trường đại học có đạo tạo ngành kỹ thuật xây dựng.')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S002', N'Kĩ Thuật Phần mềm', N'DM005',N'TG031', N'NXB06', 100, N'sách Lập Trình')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S0020', N'Kết cấu bê tông cốt thép - Phần cấu kiện cơ bản', N'DM004', N'TG045', N'NXB013', 1, N'Cuốn sách này nhằm hệ thống hóa và trang bị các khái niệm, thông tin cơ bản về các hệ thống kỹ thuật trong công trình cho các sinh viên trong trường Đại học Xây dựng nói riêng cũng như các trường đại học có đạo tạo ngành kỹ thuật xây dựng.')

INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S0021', N'Ngoại ngữ 1', N'DM005', N'TG048', N'NXB014', 1, N'Nội dung chính của sách, gồm từ mới, mẫu câu được giới thiệu bằng hình ảnh trực quan kết hợp với việc nghe đĩa,
								kế đến là những bài tập đọc hiểu. Các chủ điểm ngữ pháp được đưa vào sách một cách nhẹ nhàng và tự nhiên thông qua 
								các tình huống thực tế.')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S0022', N'Grammar in use', N'DM005', N'TG049', N'NXB014', 4, N'Nội dung chính của sách, gồm từ mới, mẫu câu được giới thiệu bằng hình ảnh trực quan kết hợp với việc nghe đĩa,
								kế đến là những bài tập đọc hiểu. Các chủ điểm ngữ pháp được đưa vào sách một cách nhẹ nhàng và tự nhiên thông qua 
								các tình huống thực tế.')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S0023', N'Listen carefully', N'DM005', N'TG048', N'NXB014', 2, N'Nội dung chính của sách, gồm từ mới, mẫu câu được giới thiệu bằng hình ảnh trực quan kết hợp với việc nghe đĩa,
								kế đến là những bài tập đọc hiểu. Các chủ điểm ngữ pháp được đưa vào sách một cách nhẹ nhàng và tự nhiên thông qua 
								các tình huống thực tế.')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S0024', N'Ngoại ngữ cơ bản', N'DM005', N'TG048', N'NXB014', 2, N'Nội dung chính của sách, gồm từ mới, mẫu câu được giới thiệu bằng hình ảnh trực quan kết hợp với việc nghe đĩa,
								kế đến là những bài tập đọc hiểu. Các chủ điểm ngữ pháp được đưa vào sách một cách nhẹ nhàng và tự nhiên thông qua 
								các tình huống thực tế.')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S0025', N'Ngoại ngữ 2', N'DM005', N'TG048', N'NXB014', 1, N'Nội dung chính của sách, gồm từ mới, mẫu câu được giới thiệu bằng hình ảnh trực quan kết hợp với việc nghe đĩa,
								kế đến là những bài tập đọc hiểu. Các chủ điểm ngữ pháp được đưa vào sách một cách nhẹ nhàng và tự nhiên thông qua 
								các tình huống thực tế.')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S0026', N'Kỹ thuật xử lý tín hiệu điều khiển', N'DM001', N'TG041', N'NXB012', 1, N'Giáo trình này được sử dụng làm tài liệu học tập cho sinh viên các khối ngành kỹ thuật và các ngành có liên quan đến kỹ thuật.')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S0027', N'Bài tập vi điều khiển và PLC', N'DM001', N'TG047', N'NXB012', 4, N'')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S0028', N'Khí cụ điện - kết cấu, sử dụng và sửa chữa', N'DM001', N'TG046', N'NXB012', 2, N'Giáo trình này được sử dụng làm tài liệu học tập cho sinh viên các khối ngành kỹ thuật và các ngành có liên quan đến kỹ thuật.')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S0029', N'Sổ tay chuyên ngành điện', N'DM001', N'TL002', N'NXB012', 2, N'Giáo trình này được sử dụng làm tài liệu học tập cho sinh viên các khối ngành kỹ thuật và các ngành có liên quan đến kỹ thuật.')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S003', N'Công Nghệ', N'DM002', N'TG031', N'NXB06', 100, N'sách trữ tình')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S0030', N'Bài tập điều khiển tự động', N'DM001', N'TG050', N'NXB012', 1, N'Giáo trình này được sử dụng làm tài liệu học tập cho sinh viên các khối ngành kỹ thuật và các ngành có liên quan đến kỹ thuật.')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S0031', N'Sổ tay máy làm đất và làm đường', N'DM004', N'TG51', N'NXB013', 10, N'Cuốn sách này nhằm hệ thống hóa và trang bị các khái niệm, thông tin cơ bản về các hệ thống kỹ thuật trong công trình cho các sinh viên trong trường Đại học Xây dựng nói riêng cũng như các trường đại học có đạo tạo ngành kỹ thuật xây dựng.')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S0032', N'Móng cọc phân tích và thiết kế', N'DM004', N'TG042', N'NXB013', 4, N'Cuốn sách này nhằm hệ thống hóa và trang bị các khái niệm, thông tin cơ bản về các hệ thống kỹ thuật trong công trình cho các sinh viên trong trường Đại học Xây dựng nói riêng cũng như các trường đại học có đạo tạo ngành kỹ thuật xây dựng.')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S0033', N'Cấu tạo bê tông cốt thép', N'DM004', N'TG043', N'NXB013', 7, N'Cuốn sách này nhằm hệ thống hóa và trang bị các khái niệm, thông tin cơ bản về các hệ thống kỹ thuật trong công trình cho các sinh viên trong trường Đại học Xây dựng nói riêng cũng như các trường đại học có đạo tạo ngành kỹ thuật xây dựng.')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S0034', N'Kết cấu thép - Công trình đặc biệt', N'DM004', N'TG044', N'NXB013', 2, N'Cuốn sách này nhằm hệ thống hóa và trang bị các khái niệm, thông tin cơ bản về các hệ thống kỹ thuật trong công trình cho các sinh viên trong trường Đại học Xây dựng nói riêng cũng như các trường đại học có đạo tạo ngành kỹ thuật xây dựng.')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S005', N'Kết cấu bê tông cốt thép - Phần cấu kiện cơ bản', N'DM004', N'TG045', N'NXB013', 1, N'Cuốn sách này nhằm hệ thống hóa và trang bị các khái niệm, thông tin cơ bản về các hệ thống kỹ thuật trong công trình cho các sinh viên trong trường Đại học Xây dựng nói riêng cũng như các trường đại học có đạo tạo ngành kỹ thuật xây dựng.')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S004', N'Hướng Nhiệp', N'DM001', N'TG031', N'NXB06', 100, N'sách trữ tình')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S006', N'Quá Khứu Của Anh', N'DM006', N'TG031', N'NXB06', 100, N'sách trữ tình')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S007', N'Thất Tình', N'DM004', N'TG031', N'NXB06', 100, N'sách trữ tình')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S008', N'Gượng CƯời', N'DM002', N'TG031', N'NXB06', 100, N'sách trữ tình')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S009', N'Nhớ Em Người Yêu Cũ', N'DM006', N'TG031', N'NXB06', 100, N'sách trữ tình')
INSERT [dbo].[Sach] ([MaSach], [TenSach], [MaTheLoai], [MaTacGia], [MaNXB], [SoLuong], [NoiDung]) VALUES (N'S035', N'Code cùng code dạo', N'DM002', N'TG51', N'NXB015', 100, N'Hướng dẫn trở thành deverloper')

INSERT [dbo].[TheLoaiSach] ([MaTheLoai], [TenTheLoai]) VALUES (N'DM001', N'Chuyên ngành Điện-Điện tử')
INSERT [dbo].[TheLoaiSach] ([MaTheLoai], [TenTheLoai]) VALUES (N'DM002', N'Chuyên ngành Cơ khí')
INSERT [dbo].[TheLoaiSach] ([MaTheLoai], [TenTheLoai]) VALUES (N'DM003', N'Chuyên ngành Công nghệ thông tin')
INSERT [dbo].[TheLoaiSach] ([MaTheLoai], [TenTheLoai]) VALUES (N'DM004', N'Chuyên ngành Xây dựng')
INSERT [dbo].[TheLoaiSach] ([MaTheLoai], [TenTheLoai]) VALUES (N'DM005', N'Sách Tiếng Anh')
INSERT [dbo].[TheLoaiSach] ([MaTheLoai], [TenTheLoai]) VALUES (N'DM006', N'Kỹ năng sống')
INSERT [dbo].[TheLoaiSach] ([MaTheLoai], [TenTheLoai]) VALUES (N'DM007', N'Sách nước ngoài')

INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [SoDienThoai], [GioiTinh], [Email], [matKhau], [VaiTro]) VALUES (N'nv01', N'Lê Minh Hạnh', N'0937697900', 1, N'hanhle@gmail.com', N'123', 1)
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [SoDienThoai], [GioiTinh], [Email], [matKhau], [VaiTro]) VALUES (N'nv02', N'Phạm Huy Hoàng', N'0382596200', 1, N'hoangpham@gmail.com', N'123', 1)
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [SoDienThoai], [GioiTinh], [Email], [matKhau], [VaiTro]) VALUES (N'nv1', N'Nguyễn Ích Đức', N'09371233212', 1, N'ducnguyen@gmail.com', N'123', 0)
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [SoDienThoai], [GioiTinh], [Email], [matKhau], [VaiTro]) VALUES (N'nv2', N'Ngô Vĩnh Quyền', N'093791505', 0, N'quyenngo@gmail.com', N'123', 0)
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [SoDienThoai], [GioiTinh], [Email], [matKhau], [VaiTro]) VALUES (N'nv3', N'Trương Vĩnh Nguyên', N'0123423123', 0, N'nguyentruong@gmail.com', N'123', 0)

INSERT [dbo].[NhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB01', N'NXB Kim Dong')
INSERT [dbo].[NhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB010', N'NXB Giao Thong Van Tai')
INSERT [dbo].[NhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB011', N'NXB DH Quoc Gia Ha Noi')
INSERT [dbo].[NhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB012', N'NXB Điện-Điện Tử')
INSERT [dbo].[NhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB013', N'NXB Xây dựng')
INSERT [dbo].[NhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB014', N'NXB Ngoại ngữ')
INSERT [dbo].[NhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB015', N'NXB Công nghệ thông tin')
INSERT [dbo].[NhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB016', N'NXB Cơ Khí')
INSERT [dbo].[NhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB02', N'NXB Tre')
INSERT [dbo].[NhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB03', N'NXB Tong Hop TPHCM')
INSERT [dbo].[NhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB04', N'NXB Chinh tri Quoc Gia')
INSERT [dbo].[NhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB05', N'NXB Giao duc')
INSERT [dbo].[NhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB06', N'Ngo Tat To')
INSERT [dbo].[NhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB07', N'NXB Tu Phap')
INSERT [dbo].[NhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB08', N'NXB Thong tin va Truyen Thong')
INSERT [dbo].[NhaXuatBan] ([MaNXB], [TenNXB]) VALUES (N'NXB09', N'NXB Lao Dong')



INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG01', N'Wiliam Shakespeare')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG010', N'Arthur Conan Doyle')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG011', N'Edgar Allan Poe')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG012', N'Agatha Christie')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG013', N'George Orwell')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG014', N'J. K. Rowling')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG015', N'Stephen King')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG016', N'George Eliot')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG017', N'Victor Hugo')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG018', N'Mary Shelley')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG019', N'Dante Alighieri')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG02', N'Ernest Hemingway')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG020', N'Blaise Pascal')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG021', N'Fibonacci')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG022', N'Thales')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG023', N'Pythagoras')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG024', N'Euclid')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG025', N'Leonhard Euler')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG026', N'Girolamo Cardano')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG027', N'Wilhelm Leibniz')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG028', N'Archimedes')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG029', N'Nguyen Hong')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG03', N'Lev Nikolayevich Tolstoy')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG030', N'Nam Cao')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG031', N'Ngo Tat To')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG032', N'Nguyen Cong Tru')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG033', N'Kim Lan')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG034', N'Vu Trong Phung')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG035', N'Nguyen Cong Hoan')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG036', N'Tran Dang Khoa')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG037', N'To Huu')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG038', N'Viktor Frankl')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG039', N'Joe Haldeman')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG04', N'Charles Dickens')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG040', N'Carl Sagan')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG041', N'Phạm Ngọc Thắng')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG042', N'Nguyễn Thái')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG043', N'Bộ Xây dựng')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG044', N'GS.TS.Phạm Văn Hội ')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG045', N'Phan Quang Minh')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG046', N'Nguyễn Xuân Phú')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG047', N'Đặng Văn Tuệ')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG048', N'Nguyễn Như Hiền')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG049', N'Nguyễn Đức Trí')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG05', N'Jane Austen')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG050', N'Nguyễn Công Phương')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG06', N'F. Scott Fitzgerald')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG07', N'Mark Twain')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG08', N'William Faulkner')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG09', N'Jame Joyce')
INSERT [dbo].[TacGia] ([MaTacGia], [TenTacGia]) VALUES (N'TG51', N'Lưu Bá Thuận')

INSERT [dbo].[NguoiMuon] ([MaNguoiMuon], [TenNguoiMuon], [SDT], [DiaChi], [GioiTinh]) VALUES (N'NM001', N'Đinh Như Quỳnh',N'0348327795 ', N'291 Hồ Văn Huê,TP HCM',0)
INSERT [dbo].[NguoiMuon] ([MaNguoiMuon], [TenNguoiMuon], [SDT], [DiaChi], [GioiTinh]) VALUES (N'NM002', N'Trần Thanh Tâm',N' 0932491771', N'778,Nguyễn Kiệm, TP HCM',1)
INSERT [dbo].[NguoiMuon] ([MaNguoiMuon], [TenNguoiMuon], [SDT], [DiaChi], [GioiTinh]) VALUES (N'NM003', N'Bùi Ngọc Hành',N'0912790435', N'34 Mai Thị Lự, TP HCM',1)
INSERT [dbo].[NguoiMuon] ([MaNguoiMuon], [TenNguoiMuon], [SDT], [DiaChi], [GioiTinh]) VALUES (N'NM004', N'Nguyễn Thanh Tùng',N'0395222824', N'222 Nguyễn Văn Cừ, TP',1)
INSERT [dbo].[NguoiMuon] ([MaNguoiMuon], [TenNguoiMuon], [SDT], [DiaChi], [GioiTinh]) VALUES (N'NM005', N'Trần Hồng Quang',N'0232322247', N'332 Nguyễn Thái Học, TP HCM',1)
INSERT [dbo].[NguoiMuon] ([MaNguoiMuon], [TenNguoiMuon], [SDT], [DiaChi], [GioiTinh]) VALUES (N'NM006', N'Đinh Bá Tiên',N'0929387466 ', N'80 Lê Hồng Phong, TP HCM',1)
INSERT [dbo].[NguoiMuon] ([MaNguoiMuon], [TenNguoiMuon], [SDT], [DiaChi], [GioiTinh]) VALUES (N'NM007', N'Nhan Triệu Đức',N'0123958754 ', N'161 Tân Sơn, TP HCM',1)
INSERT [dbo].[NguoiMuon] ([MaNguoiMuon], [TenNguoiMuon], [SDT], [DiaChi], [GioiTinh]) VALUES (N'NM008', N'Đinh Mỹ Lệ	',N'0398652486', N'82 Nguyễn Văn Trỗi, TP HCM',0)
INSERT [dbo].[NguoiMuon] ([MaNguoiMuon], [TenNguoiMuon], [SDT], [DiaChi], [GioiTinh]) VALUES (N'NM009', N'Lê Thành Tiến',N'0395875452 ', N'242 Tô Ký, TP HCM',1)
INSERT [dbo].[NguoiMuon] ([MaNguoiMuon], [TenNguoiMuon], [SDT], [DiaChi], [GioiTinh]) VALUES (N'NM0010', N'Lê Thị Như Ý',N'0372672895 ', N'645 Hoàng Sa, TP HCM',0)


GO

ALTER TABLE [dbo].[CTPhieuMuon] WITH CHECK ADD CONSTRAINT[FK_CTPhieuMuon_Sach] FOREIGN KEY([MaSach])
REFERENCES  [dbo].[Sach] ([MaSach])
GO
ALTER TABLE [dbo].[CTPhieuMuon]  WITH CHECK ADD CONSTRAINT[FK_CTPhieuMuon_PhieuMuon] FOREIGN KEY([MaPM])
REFERENCES [dbo].[PhieuMuon] ([MaPM])
GO
ALTER TABLE [dbo].[PhieuMuon]  WITH CHECK ADD CONSTRAINT[FK_PhieuMuon_NhanVien] FOREIGN KEY([MaNV])
REFERENCES [dbo].[NhanVien] ([MaNV])
GO
ALTER TABLE [dbo].[Sach]  WITH CHECK ADD CONSTRAINT[FK_Sach_TheLoaiSach] FOREIGN KEY([MaTheLoai])
REFERENCES [dbo].[TheLoaiSach] ([MaTheLoai])
GO
ALTER TABLE [dbo].[Sach]  WITH CHECK ADD CONSTRAINT[FK_Sach_MaTacGia] FOREIGN KEY([MaTacGia])
REFERENCES [dbo].[TacGia] ([MaTacGia])
GO
ALTER TABLE [dbo].[Sach]  WITH CHECK ADD CONSTRAINT[FK_Sach_NhaXuatBan] FOREIGN KEY([MaNXB])
REFERENCES [dbo].[NhaXuatBan] ([MaNXB])
GO
ALTER TABLE [dbo].[PhieuMuon]  WITH CHECK ADD CONSTRAINT[FK_PhieuMuon_NguoiMuon] FOREIGN KEY([MaNguoiMuon])
REFERENCES [dbo].[NguoiMuon] ([MaNguoiMuon])

GO
SELECT b.MaNV, b.TenNV 
FROM dbo.PhieuMuon AS a, dbo.NhanVien AS b
WHERE a.MaNV = b.MaNV AND a.trangThai = N'Chưa trả'

SELECT c.TenNV, a.ngayMuon, a.soNgayMuon, b.NgayTra, ((DAY(b.NgayTra) - DAY(a.ngayMuon)) - a.soNgayMuon) AS 'Số ngày quá hạn' 
                    FROM dbo.PhieuMuon AS a, dbo.CTPhieuMuon AS b, dbo.NhanVien AS c
                    WHERE a.MaPM = b.MaPM AND a.MaNV = c.MaNV 
                    	AND DAY(b.NgayTra) - DAY(a.NgayMuon) > a.SoNgayMuon

SELECT DISTINCT TOP 1 COUNT(a.MaNV) AS 'Số lần mượn', b.TenNguoiMuon
                    FROM dbo.PhieuMuon AS a, dbo.NguoiMuon AS b
                    WHERE a.MaNguoiMuon = b.MaNguoiMuon
                    GROUP BY b.TenNguoiMuon
                    ORDER BY [Số lần mượn] DESC

SELECT MONTH(a.NgayTra) AS 'Tháng', SUM(a.TienPhat) AS 'Tổng tiền phạt'
                    FROM dbo.CTPhieuMuon AS a, dbo.PhieuMuon AS b
                    WHERE a.MaPM = b.MaPM
                    GROUP BY MONTH(a.NgayTra)
					go
SELECT DISTINCT TOP 1 COUNT(a.MaSach) AS 'Số lần mượn trong ngày', a.maSach, b.tenSach, c.ngayMuon
                    FROM dbo.CTPhieuMuon AS a, dbo.Sach AS b, dbo.PhieuMuon AS c
                    WHERE a.MaPM = c.MaPM AND a.maSach = b.maSach
                    GROUP BY c.ngayMuon, a.maSach, b.tenSach

SELECT DISTINCT TOP 1 COUNT(a.MaNV) AS 'Số lần mượn', b.TenNV
                    FROM dbo.PhieuMuon AS a, dbo.NhanVien AS b
                    WHERE a.MaNV = b.MaNV
                    GROUP BY b.TenNV
                    ORDER BY [Số lần mượn] DESC

SELECT COUNT(a.maSach) AS 'Số sách được mượn trong tháng',MONTH(c.ngayMuon) AS 'Tháng'
                FROM dbo.CTPhieuMuon AS a, dbo.Sach AS b, dbo.PhieuMuon AS c
                WHERE a.MaPM = c.MaPM AND a.maSach = b.maSach
                GROUP BY MONTH(c.ngayMuon)