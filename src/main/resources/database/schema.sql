CREATE TABLE exhibitions (
    id UUID PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    location VARCHAR(255) NOT NULL,
    start_date DATE NOT NULL,
    end_date DATE NOT NULL
);

CREATE TABLE booths (
    id UUID PRIMARY KEY,
    exhibition_id UUID NOT NULL,
    name VARCHAR(255) NOT NULL,
    position VARCHAR(255) NOT NULL,
    price DOUBLE PRECISION NOT NULL,
    status VARCHAR(50) NOT NULL DEFAULT 'Available',
    CONSTRAINT fk_exhibition
        FOREIGN KEY (exhibition_id)
        REFERENCES exhibitions(id)
);
