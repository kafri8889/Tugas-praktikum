# 1IA07_ANAF NAUFALIAN_50423155
# https://github.com/kafri8889/Tugas-praktikum

import requests

baseUrl = 'https://jsonplaceholder.typicode.com/'


def buildResponse(status: int, message: str, data):
    """
    fungsi ini berguna untuk membuat response
    :param status: status code
    :param message: message
    :param data: data dalam berntuk json (dict)
    :return: response dalam bentuk json (dict)
    """
    return {
            "message": message,
            "status": status,
            "data": data
        }


def get(path: str, body: dict):
    url = f"{baseUrl}/{path}"  # kombinasi dari base url dan path yang dituju

    # Request get data ke server
    response = requests.get(url, params=body)

    # Jika request berhasil (OK), return response dengan data yang didapat
    if response.status_code == 200:
        return buildResponse(200, message="Data retrieved", data=response.text)

    # Jika tidak, return response dengan status code dan null data
    return buildResponse(response.status_code, message="Failed to retrieve data", data=None)


def post(path: str, body: dict):
    """
    HTTP method untuk POST (membuat data baru ke server)
    :param path: url path
    :param body: data yang akan dibuat (dalam json)
    :return: response dalam bentuk json (dict)
    """

    url = f"{baseUrl}/{path}"  # kombinasi dari base url dan path yang dituju

    # Request post ke server, return response
    response = requests.post(url, json=body)

    # Jika data berhasil dibuat (status OK atau CREATED), kembalikan response dengan datanya
    if (response.status_code == 200 or response.status_code == 201):
        return buildResponse(200, "Data created", response.text)

    # Jika tidak, kembalikan response dengan null data
    return buildResponse(400, "Bad request", None)


if __name__ == '__main__':
    # Membuat 3 body/data yang akan di post ke server
    postBody1 = {"name": "Ju Jingyi", "username": "jjy", "email": "jjy@gmail.com"}
    postBody2 = {"name": "Lu Yuxiao", "username": "lulu", "email": "lulu@gmail.com"}
    postBody3 = {"name": "Yin Wanrui", "username": "rurui", "email": "wanrui@gmail.com"}

    # post ke 3 data, dan cetak responsenya
    # baseUrl + path => "https://jsonplaceholder.typicode.com/posts"
    response1 = post("posts", postBody1)
    print(f"DATA KE-1 => status: {response1['status']} | message: {response1['message']}")
    print(response1['data'])
    print()
    response2 = post("posts", postBody2)
    print(f"DATA KE-2 => status: {response2['status']} | message: {response2['message']}")
    print(response2['data'])
    print()
    response3 = post("posts", postBody3)
    print(f"DATA KE-3 => status: {response3['status']} | message: {response3['message']}")
    print(response3['data'])


    # request body yang berisi id data yang akan diambil
    body = {"id": 100}

    response = get("posts", body)  # response request
    print()
    print(f"Mengambil data dengan id: {body['id']}")
    print(f"Status: {response['status']}")
    print(f"Message: {response['message']}")
    print("Data:")
    print(response["data"])
