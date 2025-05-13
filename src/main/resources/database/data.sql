INSERT INTO exhibitions (id, name, description, location, start_date, end_date)
VALUES
    ('11111111-1111-1111-1111-111111111111', 'Hội chợ Công nghệ 2025', 'Triển lãm các sản phẩm công nghệ mới nhất.', 'Hà Nội', '2025-06-15', '2025-06-20'),

    ('22222222-2222-2222-2222-222222222222', 'Triển lãm Nông nghiệp', 'Sự kiện giới thiệu sản phẩm nông nghiệp sạch và công nghệ canh tác mới.', 'TP. Hồ Chí Minh', '2025-07-10', '2025-07-12'),

    ('33333333-3333-3333-3333-333333333333', 'Hội chợ Du lịch Quốc tế', 'Giao lưu văn hóa và quảng bá du lịch các nước.', 'Đà Nẵng', '2025-08-01', '2025-08-05');

INSERT INTO booths (id, exhibition_id, name, position, price, status)
VALUES
    ('aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa', '11111111-1111-1111-1111-111111111111', 'Booth A1', 'Khu A - Số 1', 1000000, 'Available'),
    ('bbbbbbbb-bbbb-bbbb-bbbb-bbbbbbbbbbbb', '11111111-1111-1111-1111-111111111111', 'Booth A2', 'Khu A - Số 2', 1200000, 'Occupied'),
    ('cccccccc-cccc-cccc-cccc-cccccccccccc', '22222222-2222-2222-2222-222222222222', 'Booth B1', 'Khu B - Số 1', 800000, 'Available'),
    ('dddddddd-dddd-dddd-dddd-dddddddddddd', '22222222-2222-2222-2222-222222222222', 'Booth B2', 'Khu B - Số 2', 850000, 'Occupied'),
    ('eeeeeeee-eeee-eeee-eeee-eeeeeeeeeeee', '33333333-3333-3333-3333-333333333333', 'Booth C1', 'Khu C - Số 1', 950000, 'Available'),
    ('ffffffff-ffff-ffff-ffff-ffffffffffff', '33333333-3333-3333-3333-333333333333', 'Booth C2', 'Khu C - Số 2', 1000000, 'Available');
