# syntax=docker/dockerfile:1
FROM jupyter/base-notebook
LABEL Uday Jain <uday9k@gmail.com>
WORKDIR /uday
COPY requirements.txt requirements.txt
# RUN pip install notebook
ENV TZ=UTC
RUN python -m pip install --no-cache-dir --upgrade -r requirements.txt pip
EXPOSE 8888
# COPY . .
CMD ["jupyter", "notebook", "--port=8888", "--no-browser", "--ip=0.0.0.0", "--allow-root", "--NotebookApp.token='test123'", "--NotebookApp.password=''"]
