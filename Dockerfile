FROM ubuntu:latest
LABEL authors="ptokos"

ENTRYPOINT ["top", "-b"]