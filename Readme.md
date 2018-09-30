### 使用方式 ###
#### 使用 IDEA 方式使用 ####
1. 获取项目源码：[https://github.com/texousliu/archetype-stable.git](https://github.com/texousliu/archetype-stable.git)
2. 进入项目所在文件夹（进入 archetype-stable 中）
3. 使用 maven 编译项目 ( mvn clean install )
4. 打开 idea 
5. 点击 File >> new >> project
6. 左侧选择 maven，右侧选择 create from arthetype, 点击 add archetype
7. 填入 GroupId（cn.texous.archetype）、ArtifactId（myself_archetype_stable_web）、Version（0.0.1-SNAPSHOT）
8. 选择 刚刚导入的 骨架项目
9. 填入项目创建信息
10. 添加 骨架所需的 folderPrefix 参数
11. 创建
12. 创建完成

-----------
>4 ~ 9 流程图解
![4 ~ 9 流程图解](http://leven-test-bucket.nos-eastchina1.126.net/doc/myself/archetype-stable/import_used_archetype.png)
>10 步流程图解
![10 步流程图解](http://leven-test-bucket.nos-eastchina1.126.net/doc/myself/archetype-stable/definition_property.png)
>项目结构详细图
![项目结构详细图](http://leven-test-bucket.nos-eastchina1.126.net/doc/myself/archetype-stable/archetype_structure.png)
>项目构建日志
http://leven-test-bucket.nos-eastchina1.126.net/doc/myself/archetype-stable/maven_build_log.png

----------
#### 使用命令行导入 ####
1. 前三步同 IDEA 方式
2. ${JAVA_HOME}\bin\java.exe -Dmaven.multiModuleProjectDirectory=${tempdey} -Dmaven.home=${M2_HOME} -Dclassworlds.conf=${M2_HOME}\bin\m2.conf -Dfile.encoding=UTF-8 -classpath ${M2_HOME}\boot\plexus-classworlds-2.5.2.jar org.codehaus.classworlds.Launcher --debug -s ${M2_HOME}\conf\settings.xml -Dmaven.repo.local=${maven仓库地址} -DinteractiveMode=false -DgroupId=${groupId} -DartifactId=${artifactId} -Dversion=${version} -DarchetypeGroupId=cn.texous.archetype -DarchetypeArtifactId=myself_archetype_stable_web -DarchetypeVersion=0.0.1-SNAPSHOT -DfolderPrefix=${folderPrefix} org.apache.maven.plugins:maven-archetype-plugin:RELEASE:generate
3. 参数解释：${JAVA_HOME}=java目录; ${temodey}=自定义文件夹; ${M2_HOME}=maven项目安装目录; 

