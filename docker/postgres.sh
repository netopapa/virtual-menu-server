#!/usr/bin/env bash
sudo docker run --name virtualmenu-postgres \
    -p 5434:5432 \
    -e POSTGRES_USER=postgres \
    -e POSTGRES_PASSWORD=postgres \
    -e POSTGRES_DB=virtualmenu \
    --restart=always \
    -d postgres:11-alpine