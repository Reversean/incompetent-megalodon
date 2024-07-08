create type content_type as enum ('Table', 'Directory');
create cast (varchar AS content_type) with inout as implicit;

create table contents (
    id uuid primary key,
    project_id uuid,
    author_id uuid,
    parent_id uuid references contents(id),
    name varchar(256) not null,
    type content_type not null,
    date_created timestamp with time zone default now() not null
);