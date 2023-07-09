cmake_minimum_required(VERSION 3.22.1)

project(WareTool)

add_library(rwnative MODULE)
target_sources(rwnative PRIVATE rw/kitchen.c)

target_link_libraries(rwnative )