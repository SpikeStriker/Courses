# syntax=docker/dockerfile:1
FROM pytorch/pytorch
LABEL Uday Jain <uday9k@gmail.com>
WORKDIR /uday
COPY requirements.txt requirements.txt
RUN pip install notebook
ENV TZ=UTC
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime
USER root
RUN apt-get update && apt-get install -y --no-install-recommends apt-utils build-essential curl xvfb git
RUN apt-get update && apt-get install -y --no-install-recommends ffmpeg xorg-dev libsdl2-dev swig cmake python3-opengl
RUN python -m pip install --no-cache-dir --upgrade -r requirements.txt pip
RUN python -m pip install git+https://github.com/eleurent/rl-agents
EXPOSE 8888
CMD ["jupyter", "notebook", "--port=8888", "--no-browser", "--ip=0.0.0.0", "--allow-root", "--NotebookApp.token='test123'", "--NotebookApp.password=''"]
