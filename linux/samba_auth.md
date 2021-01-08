# ユーザー認証付き共有ディレクトリの作成

## 条件

    共有名：kaihatsu_share  
    アクセス制限：kaihatsuグループに所属するユーザ  
    kaihatsuグループのユーザ:suzuki、 tanaka、 yamamoto  

    共有名：system_share  
    アクセス制限：systemグループに所属するユーザ  
    systemグループのユーザ:yamada、 takahashi、 aoki  

    共有名：public  
    アクセス制限：kaihatsuとsystemグループのみ  
    publicグループのユーザ:yamada、 takahashi、 aoki  


## Linux側で追加   

### ディレクトリの作成   

対象：kaihatsu_share, system_share,public   
上記のディレクトリをそれぞれ作成する  

```
$sudo mkdir /home/xxxx
```


### パーミッションの設定   

対象：kaihatsu_share, system_share,public   
上記のディレクトリにそれぞれ設定する

```
$sudo chmod xxx /home/xxxx
```


### ユーザーの作成   

対象：suzuki, tanaka, yamamoto, yamada, takahashi, aoki   
上記それぞれ作成する

```
$sudo adduser xxxx
```

### グループの作成   

対象：kaihatsu, system, public   
上記それぞれ作成する    

```
$sudo addgroup xxxx
```

## 作成したグループにそれぞれ所属させる

kaihatsuグループのユーザ:suzuki, tanaka, yamamoto   
systemグループのユーザ:yamada, takahashi, aoki    
上記それぞれ追加する    

```
$sudo adduser {user} {group}
```

# Samba側での設定   

## smb.confファイルの編集

### 80行目付近
    
    security = user
    passdb backend = yes

### ファイル末尾に追加

    [xxxx_share等]
    path = /home/xxxx/
    browseable = yes
    writable = yes
    guest ok = no
    guest only = no
    create mode = 0776等
    directory mode = 0776等
    valid users = 
      ユーザー複数の場合：xxxx, yyyy, zzzz
      グループ単位の場合：@{グループ名}
    

## pdbeditで登録

### sambaへユーザーを登録する

```
$sudo pdbedit -a {user}
```





